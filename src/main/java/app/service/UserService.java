package app.service;

import app.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;

@Component
public interface UserService {
    int getUsersCount();
    List<User> getUsers();
    String addUser(User user, BindingResult bindingResult);
    String updateUser(User user, BindingResult bindingResult);
    void deleteUserById(long id);
    User getUserByID(long id);
}
