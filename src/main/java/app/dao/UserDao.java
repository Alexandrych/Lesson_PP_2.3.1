package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    int getUsersCount();
    List<User> getUsers();
    void addUser(User user);
    void updateUser(int id, User user);
    void deleteUser(User user);
    void deleteUserById(int id);
    User getUserByID(int id);
}
