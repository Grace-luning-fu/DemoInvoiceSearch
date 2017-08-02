package me.grace.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/index")
    public String defaultRequest(Model model){
        model.addAttribute("message");
        return "welcome";
    }

    @RequestMapping("/login")
    public String disLogin(Model model) {
        model.addAttribute("message");
        return "login";
    }

    @RequestMapping("/addproduct")
    public String addProduct(Model model) {
        model.addAttribute("message");
        return "addproduct";
    }

    @RequestMapping("/listproduct")
    public String listProduct(Model model) {
        model.addAttribute("message");
        return "listproduct";
    }

    @RequestMapping("/listindependency")
    public String index(Model model) {
        model.addAttribute("message", "The independencies includes: 1 web, 2 Thymeleaf, 3 test");
        return "List";

    }
}
