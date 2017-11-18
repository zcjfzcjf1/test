package com.neo.service;

import com.neo.entity.Users;

import java.util.List;

public interface UserService {

    public List<Users> getUserList();

    public Users findUserById(long id);

    public void save(Users user);

    public void edit(Users user);

    public void delete(long id);


}
