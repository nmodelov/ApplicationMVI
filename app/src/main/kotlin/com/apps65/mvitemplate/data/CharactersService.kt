package com.apps65.mvitemplate.data

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface CharactersService {

    @GET("people/{id}")
    suspend fun getCharacterById(@Path("id") id: Int): CharacterDto
}