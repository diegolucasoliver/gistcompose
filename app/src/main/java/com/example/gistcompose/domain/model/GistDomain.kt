package com.example.gistcompose.domain.model

import com.example.gistcompose.network.model.FilesResponse
import com.example.gistcompose.network.model.GistResponse

data class GistDomain(
    val files: Set<String>,
    val owner: OwnerDomain
)

fun GistResponse.toDomain(): GistDomain {
    return GistDomain(
        files = files?.toDomain() ?: emptySet(),
        owner = owner?.toDomain() ?: OwnerDomain()
    )
}

fun Map<String, FilesResponse>.toDomain(): Set<String> {
    return this.map { it.value.type.orEmpty() }.toSet()
}
