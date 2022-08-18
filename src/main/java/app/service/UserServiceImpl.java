package app.service;

import app.dao.UserDao;
import app.dao.UserDaoJPA;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int getUsersCount() {
        return userDao.getUsersCount();
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public String addUser(User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "users";
        }
        userDao.addUser(user);
        return "redirect:/users";
    }

    @Override
    @Transactional
    public String updateUser(User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        userDao.updateUser(user);
        return "redirect:/users";
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public User getUserByID(long id) {
        return userDao.getUserByID(id);
    }

}
