package com.fastnews.ui.timeline

import android.util.Log
import androidx.paging.PageKeyedDataSource
import com.fastnews.service.api.RedditService
import com.fastnews.service.model.PostData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataSource : PageKeyedDataSource<String, PostData>() {
//        private val api = RedditService.createService()

        override fun loadInitial(
            params: LoadInitialParams<String>,
            callback: LoadInitialCallback<String, PostData>) {

//            api.getPosts(loadSize = params.requestedLoadSize)
//                .enqueue(object : Callback<RedditApiResponse> {
//
//                    override fun onFailure(call: Call<RedditApiResponse>?, t: Throwable?) {
//                        Log.e("RedditDataSource", "Failed to fetch data!")
//                    }
//
//                    override fun onResponse(
//                        call: Call<RedditApiResponse>?,
//                        response: Response<RedditApiResponse>
//                    ) {
//
//                        val listing = response.body()?.data
//                        val redditPosts = listing?.children?.map { it.data }
//                        callback.onResult(redditPosts ?: listOf(), listing?.before, listing?.after)
//                    }
//                })
        }

        override fun loadAfter(
            params: LoadParams<String>,
            callback: LoadCallback<String, PostData>) {

//            api.getPosts(loadSize = params.requestedLoadSize, after = params.key)
//                .enqueue(object : Callback<RedditApiResponse> {
//
//                    override fun onFailure(call: Call<RedditApiResponse>?, t: Throwable?) {
//                        Log.e("RedditDataSource", "Failed to fetch data!")
//                    }
//
//                    override fun onResponse(
//                        call: Call<RedditApiResponse>?,
//                        response: Response<RedditApiResponse>
//                    ) {
//
//                        val listing = response.body()?.data
//                        val items = listing?.children?.map { it.data }
//                        callback.onResult(items ?: listOf(), listing?.after)
//                    }
//                })
        }

        override fun loadBefore(
            params: LoadParams<String>,
            callback: LoadCallback<String, PostData>) {

//            api.getPosts(loadSize = params.requestedLoadSize, before = params.key)
//                .enqueue(object : Callback<RedditApiResponse> {
//
//                    override fun onFailure(call: Call<RedditApiResponse>?, t: Throwable?) {
//                        Log.e("RedditDataSource", "Failed to fetch data!")
//                    }
//
//                    override fun onResponse(
//                        call: Call<RedditApiResponse>?,
//                        response: Response<RedditApiResponse>
//                    ) {
//
//                        val listing = response.body()?.data
//                        val items = listing?.children?.map { it.data }
//                        callback.onResult(items ?: listOf(), listing?.before)
//                    }
//                })
        }
}