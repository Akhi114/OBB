package com.BusBooking.OBB.Service;

import com.BusBooking.OBB.Entity.User;
import com.BusBooking.OBB.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepo;

    public User register(User user) {
        return userRepo.save(user);
    }

    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepo.findByEmail(email);
//        return user != null && user.get().getPassword().equals(password) ? user : null;
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }
        return Optional.empty();
    }
}
