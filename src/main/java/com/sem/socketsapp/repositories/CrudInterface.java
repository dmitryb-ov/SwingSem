package com.sem.socketsapp.repositories;



import com.sem.socketsapp.models.User;

import java.sql.SQLException;
import java.util.Optional;


public interface CrudInterface {
    boolean saveUser(User user) throws SQLException;
    Optional<User> readUser(User user) throws SQLException;
    boolean updateUser();
    boolean deleteUser();
}
