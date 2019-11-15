package com.master.degree.user_scv.controller;

import com.master.degree.user_scv.model.UserSaveDto;
import com.master.degree.user_scv.entity.User;
import com.master.degree.user_scv.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/users")
public class UserController {

    private UserService userService;

    @GetMapping
    public User getBySpecialityAndYearOfStudy(@RequestParam("email") String email) {
        return userService.getByEmail(email);
    }

    @PostMapping
    public User save(@RequestBody UserSaveDto userDto) {
        return userService.save(userDto);
    }

    @DeleteMapping
    public void delete(@RequestParam("email") String email) {
        userService.delete(email);
    }

}
