package com.example.edacycours.data.model

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class Article(
    var id: Int?,
    var title: String?,
    var description: String?,
    var url: String?,
    var image: String?,
    var websiteUrl: String?): Parcelable {

    constructor(): this(
       null,
       null,
       null,
       null,
        null,
        null
   )
}