package org.springdb.services;

import org.springdb.entities.UserEntities;
import org.springdb.helpers.ApiResponse;

import java.util.List;

public interface UserService {

    UserEntities createUser(UserEntities user);
    List<UserEntities> getAllUsers();

    ApiResponse deleteUser(int id);
}
