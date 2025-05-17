package com.proprog.smartnotes.service;
import com.proprog.smartnotes.dto.Note;
import com.proprog.smartnotes.dto.User;

import java.util.List;
public interface UserService {
    void createUser(User user);

    User getUserById(Long id);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    List<Note> getNotesByUserId(Long userId);
}
