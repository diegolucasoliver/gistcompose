package com.example.gistcompose.domain

import com.example.gistcompose.domain.model.GistDomain
import com.example.gistcompose.domain.model.toDomain
import com.example.gistcompose.network.repository.Repository

interface GistListUseCase {
    suspend fun execute(page: Int = 1, perPage: Int = 50): List<GistDomain>
}

class GistLisUseCaseImpl(val repository: Repository): GistListUseCase {
    override suspend fun execute(page: Int, perPage: Int): List<GistDomain> {
        return repository.fetchGistList(page, perPage).map { it.toDomain() }
    }
}

