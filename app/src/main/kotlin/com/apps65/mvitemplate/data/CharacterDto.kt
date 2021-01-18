package com.apps65.mvitemplate.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
data class CharacterDto(
    @Json(name = "message") val message: String,
    @Json(name = "result") val result: ResultCharacter
)

@Parcelize
@JsonClass(generateAdapter = true)
data class ResultCharacter(
    @Json(name = "properties") val properties: Character,
    @Json(name = "description") val description: String
): Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Character(
    @Json(name = "height") val height: String,
    @Json(name = "mass") val mass: String,
    @Json(name = "hair_color") val hairColor: String,
    @Json(name = "skin_color") val skinColor: String,
    @Json(name = "eye_color") val eyeColor: String,
    @Json(name = "birth_year") val birthYear: String,
    @Json(name = "gender") val gender: String,
    @Json(name = "name") val name: String
): Parcelable

