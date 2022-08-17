package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    int getUsersCount();
    List<User> getUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUserById(long id);
    User getUserByID(long id);
}
