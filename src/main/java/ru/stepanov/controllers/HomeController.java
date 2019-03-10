package ru.stepanov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                       @RequestParam(name = "param1", required = false, defaultValue = "0") String param1,
                       @RequestParam(name = "param2", required = false, defaultValue = "0") String param2,
                       Model model) {
        model.addAttribute("name", name);

        if (param1 != null && param2 != null) {
            int sum = Integer.parseInt(param1) + Integer.parseInt(param2);
            model.addAttribute("sum", sum);
        }

        return "main";
    }

}
