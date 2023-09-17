package dev.stoiclionroars.bookmarks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeController {

    @GetMapping("/")
    public String getFake() {
        return "Fake Answer";
    }
    
}
