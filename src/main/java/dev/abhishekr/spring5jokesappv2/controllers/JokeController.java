package dev.abhishekr.spring5jokesappv2.controllers;

import dev.abhishekr.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

}
