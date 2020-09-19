package com.example.jpa.Service;

import com.example.jpa.Model.User;
import com.example.jpa.Model.UserProfile;
import com.example.jpa.Model.UserRow;
import com.example.jpa.Repository.UserProfileRepository;
import com.example.jpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserProfileRepository userProfileRepository;

    @Autowired
    public UserService(UserRepository userRepository, UserProfileRepository userProfileRepository) {
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public UserRow save(UserRow userRow) {
        User u = userRow.user;
        UserProfile up = userRow.userProfile;
        u.setUserProfile(up);
        up.setUser(u);
        User uSaved = userRepository.save(u);
        UserProfile upSaved = uSaved.getUserProfile();
        return new UserRow(uSaved, upSaved);
    }
}
