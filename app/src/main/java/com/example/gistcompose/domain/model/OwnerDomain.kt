package com.example.gistcompose.domain.model

import com.example.gistcompose.EMPTY_TEXT
import com.example.gistcompose.network.model.OwnerResponse

data class OwnerDomain(
    val login: String = EMPTY_TEXT,
    val avatarUrl: String = EMPTY_TEXT,
    val htmlUrl: String = EMPTY_TEXT
)

fun OwnerResponse.toDomain(): OwnerDomain {
    return OwnerDomain(
        login = login.orEmpty(),
        avatarUrl = avatarUrl.orEmpty(),
        htmlUrl = htmlUrl.orEmpty()
    )
}
