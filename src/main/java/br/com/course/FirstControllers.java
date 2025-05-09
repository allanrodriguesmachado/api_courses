
package br.com.course;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstControllers {

    @GetMapping("/list")
    public String items() {
        return "My API REST FULL";
    }
}