package uz.coder24.thymleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.coder24.thymleaftest.entity.User;

import java.util.Date;

@Controller
@RequestMapping
public class TestController {

    @GetMapping("/auth/register")
    public String getMain() {
        return "register";
    }

    @GetMapping("/auth/get")
    public String getMain(Model model) {
        model.addAttribute("user", new User(1L, "s", "s", false, new Date(), new Date()));
        model.addAttribute("test","spring.io");
        return "test";
    }

    @PostMapping("/auth/registers")
    public String register(@ModelAttribute(name = "users") User users) {
        System.out.println(users.toString());
        return "index";
    }

}
