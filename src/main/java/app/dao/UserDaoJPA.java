package app.dao;


import app.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoJPA implements UserDao {

    private static int ID_COUNT = 4;
    private static final List<User> list = new ArrayList<>();

//    @PersistenceContext
//    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;


//    static {
//        list.add(new User(1, "ivan", "petrov", (byte) 5));
//        list.add(new User(2, "sanya", "sidorov", (byte) 50));
//        list.add(new User(3, "stasyam", "pupkin", (byte) 25));
//        try (Session session = sessionFactory.openSession()) {
//            session.save(new User("ivan", "petrov", (byte) 5, false));
//            session.save(new User("sanya", "sidorov", (byte) 50, true));
//            session.save(new User("stasyam", "pupkin", (byte) 25, false));
//        }
//    }

    @Override
    @Transactional
    public int getUsersCount() {
        System.out.println("try");
        return list.size();
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return list;
//        String jpql = "select u from Users u";
//        return em.createQuery(jpql, User.class)
//                .getResultList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
//        user.setId(ID_COUNT++);
//        list.add(user);
//        System.out.println("udldl" + list.size());
        entityManager.persist(user);
//        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @Transactional
    public void updateUser(int id, User user) {
        list.set(--id, user);
//        em.merge(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
//        if (em.contains(user)) {
//            em.remove(user);
//        } else {
//            em.remove(em.merge(user));
//        }
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        if (list.get(id) != null) {
            list.remove(id);
        }
    }

    @Override
    @Transactional
    public User getUserByID(int id) {
        return list.get(--id);
    }
}
