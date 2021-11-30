package com.example.gistcompose.domain.di

import com.example.gistcompose.domain.GistLisUseCaseImpl
import com.example.gistcompose.domain.GistListUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<GistListUseCase> {
        GistLisUseCaseImpl(repository = get())
    }
}