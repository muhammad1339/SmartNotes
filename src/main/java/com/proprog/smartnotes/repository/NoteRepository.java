package com.proprog.smartnotes.repository;

import com.proprog.smartnotes.dto.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find notes by user ID:
     List<Note> findByUserId(Long userId);
}
