package com


import com.google.gson.annotations.SerializedName

data class RecipeResponse(
    @SerializedName("html")
    val html: Html
)