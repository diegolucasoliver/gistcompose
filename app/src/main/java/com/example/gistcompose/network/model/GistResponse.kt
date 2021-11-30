package com.example.gistcompose.network.model

data class GistResponse(
    val files: Map<String, FilesResponse>?,
    val owner: OwnerResponse?
)
