package com.example.notes_app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notes_app.data.local.dao.NoteDao
import com.example.notes_app.data.local.model.LocalNote

@Database(
    entities = [LocalNote::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun getNoteDao(): NoteDao
}