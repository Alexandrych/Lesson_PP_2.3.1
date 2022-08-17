package app.service;

import app.dao.UserDao;
import app.dao.UserDaoJPA;
import app.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoJPA();

    public int getUsersCount() {
        return userDao.getUsersCount();
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    public void deleteUser(User user) {

    }

    public void deleteUserById(int i) {
        userDao.deleteUserById(i);
    }

    public User getUserByID(int id) {
        return userDao.getUserByID(id);
    }

}
