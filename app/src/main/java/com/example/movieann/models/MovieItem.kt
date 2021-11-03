package com.example.movieann.models

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieItem(
    //@SerializedName("movie_poster")
    //val poster: String,

    @SerializedName("movie_title")
    val title: String?,

    @SerializedName("movie_release_date")
    val release: String?,
): Parcelable{
    //constructor(): this("", "", "")
}
