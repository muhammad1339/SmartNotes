package com.proprog.smartnotes.service;

import com.proprog.smartnotes.dto.Note;
import com.proprog.smartnotes.dto.User;
import com.proprog.smartnotes.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalToDo = repository.findById(id);
        if(optionalToDo.isEmpty()) {
            throw new RuntimeException("there is no user with this id " + id);
        }
        return optionalToDo.get();
    }

    @Override
    public void updateUser(Long id, User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public List<Note> getNotesByUserId(Long userId) {
        User user = getUserById(userId);
        if (user == null) {
            throw new RuntimeException("User not found with id: " + userId);
        }
        return user.getNotes();
    }
}
