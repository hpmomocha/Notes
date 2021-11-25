package com.hpe.notes.async;

import android.os.AsyncTask;

import com.hpe.notes.models.Note;
import com.hpe.notes.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNote(notes);
        return null;
    }

}
