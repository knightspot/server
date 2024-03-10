package se.knightspot.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

    @GetMapping("/private")
    public String myProtected(){
        return "private";
    }

    @GetMapping("/public")
    public String myPublic(){
        return "public";
    }

}
