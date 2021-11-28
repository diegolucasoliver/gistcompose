package com.example.gistcompose.network.repository

import com.example.gistcompose.network.GitHubServices
import com.example.gistcompose.network.model.GistResponse

interface Repository {
    suspend fun fetchGistList(page: Int = 1, perPage: Int = 50): List<GistResponse>
}

class RepositoryImpl(val services: GitHubServices): Repository {
    override suspend fun fetchGistList(page: Int, perPage: Int): List<GistResponse> {
        return services.getGistList(page, perPage)
    }
}