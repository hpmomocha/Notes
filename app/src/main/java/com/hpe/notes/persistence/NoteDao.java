package com.hpe.notes.persistence;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.hpe.notes.models.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    long[] insertNotes(Note... notes);

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getNotes();

    @Query(("SELECT * FROM notes WHERE id = :id"))
    List<Note> getNoteWithCustomQuery(int id);

    @Delete()
    int deleteNote(Note... notes);

    @Update()
    int updateNote(Note... notes);
}
