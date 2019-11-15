package com.master.degree.user_scv.service;

import com.master.degree.user_scv.model.UserSaveDto;
import com.master.degree.user_scv.entity.User;
import com.master.degree.user_scv.exception.BadRequestException;
import com.master.degree.user_scv.mapper.UserMapper;
import com.master.degree.user_scv.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User save(UserSaveDto dto) {
        if (userRepository.existsUserByEmail(dto.getEmail())) {
            throw new BadRequestException("Email is taken");
        }
        return userRepository.save(userMapper.toStudent(dto));
    }

    @Transactional
    public void delete(String email) {
        userRepository.deleteByEmail(email);
    }
}
