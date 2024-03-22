package org.springdb.services.impl;

import org.springdb.entities.UserEntities;
import org.springdb.helpers.ApiResponse;
import org.springdb.repos.UserRepo;
import org.springdb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserEntities createUser(UserEntities user) {
        UserEntities savedUser = this.userRepo.save(user);
        return savedUser;
    }

    @Override
    public List<UserEntities> getAllUsers() {
        List<UserEntities> users = this.userRepo.findAll();
        return users;
    }
    @Override
    public ApiResponse deleteUser(int id) {
        UserEntities user = this.userRepo.findById(id).orElseThrow();
        this.userRepo.delete(user);
        return new ApiResponse(true, "User detele from db userId is :"+id);
    }
}
