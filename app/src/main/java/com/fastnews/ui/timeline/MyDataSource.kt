package com.fastnews.ui.timeline

import android.util.Log
import androidx.lifecycle.ViewModelProviders
import androidx.paging.PageKeyedDataSource
import com.fastnews.service.api.RedditAPI
import com.fastnews.service.api.RedditService
import com.fastnews.service.model.PostData
import com.fastnews.service.model.PostResponse
import com.fastnews.viewmodel.PostViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyDataSource : PageKeyedDataSource<String, PostData>() {
            private val api = RedditAPI.redditService

    override fun loadInitial(
        params: LoadInitialParams<String>,
        callback: LoadInitialCallback<String, PostData>
    ) {

        api.getPostList(limit = params.requestedLoadSize)
            .enqueue(object : Callback<PostResponse> {

                override fun onFailure(call: Call<PostResponse>?, t: Throwable?) {
                    Log.e("RedditDataSource", "Failed to fetch data!")
                }

                override fun onResponse(
                    call: Call<PostResponse>?,
                    response: Response<PostResponse>
                ) {

                    val listing = response.body()?.data
                    val redditPosts = listing?.children?.map { it.data }
                    callback.onResult(redditPosts ?: listOf(), listing?.before, listing?.after)
                }
            })
    }

    override fun loadAfter(
        params: LoadParams<String>,
        callback: LoadCallback<String, PostData>
    ) {

        api.getPostList(limit = params.requestedLoadSize, after = params.key)
            .enqueue(object : Callback<PostResponse> {

                override fun onFailure(call: Call<PostResponse>?, t: Throwable?) {
                    Log.e("RedditDataSource", "Failed to fetch data!")
                }

                override fun onResponse(
                    call: Call<PostResponse>?,
                    response: Response<PostResponse>
                ) {

                    val listing = response.body()?.data
                    val items = listing?.children?.map { it.data }
                    callback.onResult(items ?: listOf(), listing?.after)
                }
            })
    }

    override fun loadBefore(
        params: LoadParams<String>,
        callback: LoadCallback<String, PostData>
    ) {

            api.getPostList(limit = params.requestedLoadSize, before = params.key)
                .enqueue(object : Callback<PostResponse> {

                    override fun onFailure(call: Call<PostResponse>?, t: Throwable?) {
                        Log.e("RedditDataSource", "Failed to fetch data!")
                    }

                    override fun onResponse(
                        call: Call<PostResponse>?,
                        response: Response<PostResponse>
                    ) {

                        val listing = response.body()?.data
                        val items = listing?.children?.map { it.data }
                        callback.onResult(items ?: listOf(), listing?.before)
                    }
                })
    }
}