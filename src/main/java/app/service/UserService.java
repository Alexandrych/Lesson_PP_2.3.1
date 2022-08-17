package app.service;

import app.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    int getUsersCount();
    List<User> getUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUserById(long i);
    User getUserByID(long id);
}
