package at.fhtw.DesignAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static at.fhtw.DesignAPI.Color.findColor;


@RestController
public class Controller {

    @GetMapping("/")
    String hello() {
        return"Hello";
    }

    @GetMapping("/{color}")
    String capital(@PathVariable String color) {
        return findColor(color);
    }

}
