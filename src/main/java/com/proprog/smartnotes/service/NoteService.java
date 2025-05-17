package com.proprog.smartnotes.service;

import com.proprog.smartnotes.dto.Note;

import java.util.List;

public interface NoteService {
    void createNote(Note note);

    Note getNoteById(Long id);

    void updateNote(Long id, Note note);

    void deleteNote(Long id);

    List<Note> getAllNotes();

    List<Note> getNotesByUserId(Long userId);
}
