package fr.dorianmaliszewski.postservice.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
    private String title;
    private String description;
}
