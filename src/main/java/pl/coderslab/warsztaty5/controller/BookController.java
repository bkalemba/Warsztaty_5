package pl.coderslab.warsztaty5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.warsztaty5.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/hello")
    public String hello(){
        return "{msg: hello}";
    }

    @GetMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L,"9788324631766","Thinking in Java",
                "Bruce Eckel","Helion","programming");
    }
}
