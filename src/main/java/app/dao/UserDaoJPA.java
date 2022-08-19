package app.dao;

import app.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoJPA implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int getUsersCount() {
        return entityManager.createQuery("from User", User.class).getResultList().size();
    }

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void deleteUserById(long id) {
        entityManager.remove(getUserByID(id));
        entityManager.flush();
    }

    @Override
    public User getUserByID(long id) {
        return entityManager.find(User.class, id);
    }
}
