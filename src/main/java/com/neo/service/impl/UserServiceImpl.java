package com.neo.service.impl;

import com.neo.entity.Users;
import com.neo.repository.UserRepository;
import com.neo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public Users findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(Users user) {
        userRepository.save(user);
    }

    @Override
    public void edit(Users user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }
}


