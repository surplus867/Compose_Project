package com


import com.google.gson.annotations.SerializedName

data class Html(
    @SerializedName("head")
    val head: Head
)