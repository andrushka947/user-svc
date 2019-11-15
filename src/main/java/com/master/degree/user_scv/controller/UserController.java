package com.master.degree.user_scv.controller;

import com.master.degree.user_scv.model.UserSaveDto;
import com.master.degree.user_scv.entity.User;
import com.master.degree.user_scv.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/users")
public class UserController {

    private UserService userService;

    @GetMapping(path = "/{email}")
    public User getByEmail(@PathVariable("email") String email) {
        return userService.getByEmail(email);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User save(@RequestBody UserSaveDto userDto) {
        return userService.save(userDto);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email) {
        userService.delete(email);
    }

}
