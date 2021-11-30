package com.example.gistcompose.network.model

import com.google.gson.annotations.SerializedName

data class OwnerResponse(
    val login: String?,
    @SerializedName("avatar_url")
    val avatarUrl: String?,
    @SerializedName("html_url")
    val htmlUrl: String?
)
