package com.example.narxoz1.controllers;

import com.example.narxoz1.models.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String indexPage(Model model) {
        List<Items> books = new ArrayList<>();
        books.add(new Items(1L, "Harry Potter and the philosopher's stone", "J.K. Rowling", 19.99));
        books.add(new Items(2L, "Harry Potter and the chamber of secrets", "J.K. Rowling", 21.50));
        books.add(new Items(3L, "The shining", "Stephen King", 18.75));
        books.add(new Items(4L, "It", "Stephen King", 22.99));
        books.add(new Items(5L, "The lord of the rings", "J.R.R. Tolkien", 25.00));
        books.add(new Items(6L, "A game of thrones", "George R.R. Martin", 24.50));

        model.addAttribute("items", books);
        return "index";
    }
}
