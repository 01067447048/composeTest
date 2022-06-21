package com.jaehyeon.compose.composetest.feature_note.domain.repository

import com.jaehyeon.compose.composetest.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Jaehyeon on 2022/06/21.
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}