package app.controller;

import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StartPageController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUsersCount(Model model) {
        model.addAttribute("count", userService.getUsersCount());
        System.out.println("main page f5");
        return "index";
    }
}