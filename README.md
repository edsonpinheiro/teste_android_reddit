# Importante

Leia todas as instruções antes de começar.

Faça clone desse repositório e suba em outro repositório próprio, não faça fork.


# Desafio

Você vai trabalhar em um projeto que já está pronto. E deve seguir os pontos abaixo, para entender o que deve fazer nesse projeto. Leia atentamente cada ponto antes de começar.


# Regras Gerais

É permitido usar quaisquer bibliotecas que desejar para ajudar a construir este aplicativo
Utilize as boas práticas de desenvolvimento, e imagine que outras pessoas poderão ler e trabalhar no seu projeto.


# Exercícios essenciais

A arquitetura de ViewModel do projeto parece estar com algum problema, o projeto não compila.

-- O problema ocorreu porque a biblioteca OkHttp necessitava da seguinte configuração no build.gradle.

```
android {

    (...)

    compileOptions {
        sourceCompatibility = '1.8'
        targetCompatibility = '1.8'
    }
}
```

Infelizmente a resolução das imagens no aplicativo não estão boas, e isso precisa ser arrumado. Por favor, melhore a resolução das imagens, mas lembre-se, performance também é muito importante num aplicativo de notícias. O usuário não quer perder tempo.

-- Não foi possível resolver esse problema uma vez que as soluções tentadas não apresentaram o resultado esperado.

A home do aplicativo possui um feed de notícias, e seria ótimo se a paginação estivesse funcionando. Pois existem milhares de notícias disponíveis na API.

-- Foi implementada uma estrutura de paginação própria para Kotlin baseando-se em listas infinitas. Adicionou-se um DataSource para gerenciar o download dos posts em blocos. Existe algum erro que impede a lista de ser populada. Seria necessário mais tempo pra resolvê-lo.

Hoje o aplicativo não possui nenhuma cobertura de testes, ou seja, não possui testes unitários e nem testes instrumentais. Por favor, implemente alguns testes que pelo menos cubram os principais fluxos do app.

Caso encontre bugs que impactem o bom uso da aplicação, nós esperamos que eles sejam corrigidos. Desta forma vamos manter um número saudável de DAO/MAO e de Churn. Nos preocupamos muito com a experiência de nossos usuários.


# Exercícios bônus

Hoje o usuário só consegue ler uma notícia se ele estiver on-line, que tal implementar uma forma do usuário poder continuar lendo uma notícia caso fique sem internet? Dessa forma o usuário não vai perder no meio aquele conteúdo interessante.

Melhor do que ler uma notícia super interessante, é poder compartilhar essa notícia. Por favor, implemente no aplicativo uma forma de compartilhar as notícias nas redes sociais.

Melhorar a estrutura do ViewModel implementada no projeto.

# Avaliação

Vamos ver como você estruturou seu código, o quão aderente as soluções e features estão as boas práticas, e se as funcionalidades estão implementadas de modo a não ferir o ciclo de vida da aplicação. 

Veremos também o quanto os testes estão aderentes ao projeto, e o quão legível eles estão.

Um código bem estruturado e que se preocupe muito com o alto desempenho será um diferencial.

# Envio
Assim que concluir o projeto, por favor, nos envie o link do seu repositório. Qualquer dificuldade ou problema nos comunique!

# Comentários adicionais
O teste foi bastante interessante do ponto de vista do conhecimento de novas tecnologias.

Dentre as dificuldades, destaco a falta de familiaridade com o Kotlin, visto que atualmente trabalho usando Java, então compreender o fluxo da aplicação foi algo que tomou certo tempo.

Por outro lado, é um trabalho que me fez sair da zona de conforto. Sou bastante grato pela oportunidade!
