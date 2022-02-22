package com.igor.cats.data.response

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("link")
    val link: String
)