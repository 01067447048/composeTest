package com.jaehyeon.compose.composetest.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jaehyeon.compose.composetest.feature_note.domain.model.Note

/**
 * Created by Jaehyeon on 2022/06/21.
 */
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes"
    }
}