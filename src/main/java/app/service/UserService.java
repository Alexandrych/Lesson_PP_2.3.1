package app.service;

import app.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    int getUsersCount();
    List<User> getUsers();
    void addUser(User user);
    void updateUser(int id, User user);
    void deleteUser(User user);
    void deleteUserById(int i);
    User getUserByID(int id);
}
