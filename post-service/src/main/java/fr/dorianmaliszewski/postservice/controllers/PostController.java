package fr.dorianmaliszewski.postservice.controllers;

import fr.dorianmaliszewski.postservice.models.Post;
import fr.dorianmaliszewski.postservice.repositories.PostRepository;
import fr.dorianmaliszewski.postservice.requests.PostRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(this.postRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.postRepository.findById(id));
    }

    @GetMapping("/title/contains/{search}")
    public ResponseEntity findAllTitleContains(@PathVariable String search) {
        return ResponseEntity.ok(this.postRepository.findAllByTitleContains(search));
    }

    @PostMapping
    public ResponseEntity create(@RequestBody PostRequest postRequest) {
        Post post = new Post();
        post.setDescription(postRequest.getDescription());
        post.setTitle(postRequest.getTitle());
        return ResponseEntity.ok(this.postRepository.save(post));
    }
}
