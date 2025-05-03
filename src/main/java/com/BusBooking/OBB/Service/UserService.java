package com.BusBooking.OBB.Service;

import com.BusBooking.OBB.Entity.User;
import com.BusBooking.OBB.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private UserRepository userRepo;

    public User register(User user) {
        return userRepo.save(user);
    }

    public User login(String email, String password) {
        User user = userRepo.findByEmail(email);
        return user != null && user.getPassword().equals(password) ? user : null;
    }
}
