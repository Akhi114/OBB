package com.BusBooking.OBB.Controller;

import com.BusBooking.OBB.Entity.User;
import com.BusBooking.OBB.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    @PostMapping("/login")
//    public ResponseEntity<User> login(@RequestBody Map<String, String> body) {
//        return ResponseEntity.ok(userService.login(body.get("email"), body.get("password")));
//    }
    public Optional<User> login(@RequestBody User loginRequest) {
        return userService.login(loginRequest.getEmail(), loginRequest.getPassword());
    }
}
