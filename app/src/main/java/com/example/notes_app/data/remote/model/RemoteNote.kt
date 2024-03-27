package com.example.notes_app.data.remote.model

import android.icu.text.CaseMap.Title

data class RemoteNote(
    val noteTitle: String?,
    val description : String?,
    val date : Long,
    val noteId : String
)
