package com.proprog.smartnotes.controller;

import com.proprog.smartnotes.service.NoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/smart-notes/")
public class NoteController {
    final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    // get all notes

    // get note by id
    // create note
    // update note
    // delete note
    // get notes by user id

}
