package com.github_finder.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/github")
public class Controller {

    private final Repository repo;

    public Controller(Repository repo) {
        this.repo = repo;
    }

    @GetMapping("/{username}")
    public Object getGithubProfile(@PathVariable String username) {

        String url = "https://api.github.com/users/" + username;

        RestTemplate restTemplate = new RestTemplate();

        Model history = new Model();
        history.setUsername(username);

        repo.save(history);

        return restTemplate.getForObject(url, Object.class);
    }
}
