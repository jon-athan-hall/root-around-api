package com.rootaround.api.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @GetMapping("/person")
    public String getPerson() {
        return "Person";
    }

    @GetMapping("/private")
    public String getPrivate() {
        return "Private";
    }

}
