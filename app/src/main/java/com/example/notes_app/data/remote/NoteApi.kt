package com.example.notes_app.data.remote


import com.example.notes_app.data.remote.model.RemoteNote
import com.example.notes_app.data.remote.model.SimpleResponse
import com.example.notes_app.data.remote.model.User
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface NoteApi {

    @Headers("Content-Type: application/json")
    @POST("/register")
    suspend fun createAccount(
        @Body user: User
    ): SimpleResponse

    @Headers("Content-Type: application/json")
    @POST("/login")
    suspend fun login(
        @Body user: User
    ): SimpleResponse

    //====================NOTES============================
    @Headers("Content-Type: application/json")
    @POST("/notes/create")
    suspend fun createNote(
        @Header ("Authorization") token: String,
        @Body note:RemoteNote
    ):SimpleResponse

    @Headers("Content-Type: application/json")
    @POST("/notes/get")
    suspend fun getAllNotes(
        @Header ("Authorization") token: String,
        @Body note:RemoteNote
    ):List<RemoteNote>

    @Headers("Content-Type: application/json")
    @POST("/notes/update")
    suspend fun updateNote(
        @Header ("Authorization") token: String,
        @Body note:RemoteNote
    ):SimpleResponse


    @Headers("Content-Type: application/json")
    @DELETE("/notes/delete")
    suspend fun deleteNote(
        @Header ("Authorization") token: String,
        @Query("id") noteId:String
    ):SimpleResponse



}