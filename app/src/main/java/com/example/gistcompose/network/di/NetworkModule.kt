package com.example.gistcompose.network.di

import com.example.gistcompose.network.ApiServices
import com.example.gistcompose.network.GitHubServices
import com.example.gistcompose.network.repository.Repository
import com.example.gistcompose.network.repository.RepositoryImpl
import org.koin.dsl.module

val networkModule = module {

    single<GitHubServices> {
        ApiServices.service()
            .create(GitHubServices::class.java)
    }

    factory<Repository> {
        RepositoryImpl(services = get())
    }
}