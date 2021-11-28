package com.example.gistcompose.network.di

import com.example.gistcompose.network.ApiServices
import com.example.gistcompose.network.GitHubServices
import org.koin.dsl.module

val networkModule = module {

    single<GitHubServices> {
        ApiServices.service()
            .create(GitHubServices::class.java)
    }
}