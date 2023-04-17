package com


import com.google.gson.annotations.SerializedName

data class Head(
    @SerializedName("link")
    val link: Link,
    @SerializedName("title")
    val title: String
)