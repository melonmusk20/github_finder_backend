package com.github_finder.backend;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/github")
@CrossOrigin("*")
public class Controller {

    private final Repository repo;

    public Controller(Repository repo) {
        this.repo = repo;
    }

    @GetMapping("/{username}")
    public Object getGithubProfile(@PathVariable String username) {

        String url = "https://api.github.com/users/" + username;

        RestTemplate restTemplate = new RestTemplate();

        try {

            Model history = new Model();
            history.setUsername(username);

            repo.save(history);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("/history")
    public List<Model> getHistory() {
        return repo.findAll();
    }
}
