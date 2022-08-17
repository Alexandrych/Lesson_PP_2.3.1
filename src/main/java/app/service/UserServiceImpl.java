package app.service;

import app.dao.UserDao;
import app.dao.UserDaoJPA;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
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
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUserById(long i) {
        userDao.deleteUserById(i);
    }

    @Override
    public User getUserByID(long id) {
        return userDao.getUserByID(id);
    }

}
