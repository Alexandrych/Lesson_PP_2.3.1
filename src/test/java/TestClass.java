import app.model.User;
import app.service.UserService;
import app.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class TestClass {

    UserService userService = new UserServiceImpl();

    @Test
    public void getUsers() {
        System.out.println(userService.getUsers());
    }
//
//    @Test
//    public void count() {
//        System.out.println("Пользователей в БД: " + userService.getUsersCount() + "\n");
//    }
//
//    @Test
//    public void add() {
//        System.out.println("Добавить пользователя");
//        userService.addUser(new User(1, "Stas", "b", (byte) 17));
//        System.out.println("Пользователей в БД: " + userService.getUsersCount() + "\n");
//    }
//
//    @Test
//    public void delete() {
//        System.out.println("Удалить пользователя по ид");
//        System.out.println("Пользователей в БД было: " + userService.getUsersCount());
//        userService.deleteUserById(0);
//        System.out.println("Пользователей в БД стало: " + userService.getUsersCount());
//    }
//
//    @Test
//    public void getUser () {
//        System.out.println("get user by id 1" + userService.getUserByID(1));
//    }
//
//
//    @Test
//    public void merge() {
//        System.out.println("merge:");
//        userService.updateUser(3, new User(3, "a", "b", (byte) 54));
//        System.out.println(userService.getUserByID(3) + "\n");
//    }

    @Test
    public void tableCreate () {
        userService.addUser(new User("awRY", "wtya", (byte) 5));
    }

}
