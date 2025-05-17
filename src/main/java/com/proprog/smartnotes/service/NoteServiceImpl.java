package com.proprog.smartnotes.service;

import com.proprog.smartnotes.dto.Note;
import com.proprog.smartnotes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    // create a NoteRepository field
    private  final NoteRepository noteRepository;

    // inject the NoteRepository using constructor injection
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void createNote(Note note) {
        noteRepository.save(note);
    }

    @Override
    public Note getNoteById(Long id) {

        Note note = null;
        if (noteRepository.existsById(id)) {
            note = noteRepository.findById(id).orElse(null);
        }
        if (note == null) {
            throw new RuntimeException("Note not found with id: " + id);
        }
        return note;
    }

    @Override
    public void updateNote(Long id, Note note) {

    }

    @Override
    public void deleteNote(Long id) {

    }

    @Override
    public List<Note> getAllNotes() {

        return new ArrayList<>(noteRepository.findAll());
    }

    @Override
    public List<Note> getNotesByUserId(Long userId) {
        return new ArrayList<>(noteRepository.findByUserId(userId));
    }
}
