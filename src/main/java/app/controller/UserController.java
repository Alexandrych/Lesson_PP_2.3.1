package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //GET
    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("usersList", userService.getUsers());
        model.addAttribute("modelUser", new User());
        System.out.println("get users f5");
        return "users";
    }

    //CREATE
    @PostMapping
    public String create(@ModelAttribute User user) {
        userService.addUser(user);
        System.out.println(user + "\nadded");
        return "redirect:/users";
    }

    //DELETE
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        System.out.println("delete " + userService.getUserByID(id));
        userService.deleteUserById(id);
        return "redirect:/users";
    }

    //EDIT
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        System.out.println("edit get");
        model.addAttribute("user", userService.getUserByID(id));
        System.out.println(userService.getUserByID(id));
        return "edit";
    }

    @PostMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        System.out.println("edit patch");
        userService.updateUser(id, user);
        return "redirect:/users";
    }

    //EDIT
//    @GetMapping
//    public String edidUser(@PathVariable("id") int id, Model model) {
//        model.addAttribute("user", userService.getUserByID(id));
//        return "redirect:/users";
//    }
//


//    @PostMapping
//    public String deleteUser(@RequestParam(value = "delete", required = false) int count, Model model) {
//        userService.deleteUserById(count);
//        System.out.println("deleted");
//        return "redirect:/users";
//    }

//    @PostMapping
//    public String deleteUser(@RequestParam(value = "delete", required = false) int id) {
//        userService.deleteUserById(id);
//        return "redirect:/users";
//    }

//    @GetMapping("/add")
//    public String newUser(Model model) {
//        model.addAttribute("modelUser", new User());
//        return "users";
//    }
//
//    @PostMapping("/add")
//    public String add(@ModelAttribute("user") User user) {
//        userService.addUser(user);
//        return "redirect:/users";
//    }

//    @PostMapping()
//    public String add(@RequestParam("firstName") String firstName,
//                      @RequestParam("secondName") String secondName,
//                      @RequestParam("age") byte age,
//                      @RequestParam("isMarried") boolean isMarried,
//                      Model model) {
//        User user = new User(10, firstName, secondName, age, isMarried);
//        userService.addUser(user);
//        model.addAttribute("user", user);
//        return "users";
//    }

//    @GetMapping("/{id}")
//    public String update(@PathVariable("id") int id, Model model) {
//        model.addAttribute("userById", userService.getUserByID(id));
//        //человек по id на отображение
//        return null;
//    }
//
//    @PostMapping("/{id}")
//    public String updateUser(@ModelAttribute("userById") User user) {
//        userService.updateUser(user);
//        userService.addUser(user);
//        return "redirect:/users";
//    }

}
