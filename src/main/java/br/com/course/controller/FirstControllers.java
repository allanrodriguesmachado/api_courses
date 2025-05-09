
package br.com.course.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FirstControllers {
    @GetMapping("/list")
    public List<String> items() {
        return Arrays.asList("Teste UM", "Dois", "ITEM");
    }

    @GetMapping("/idItem/{id}")
    public String idItem(@PathVariable int id)
    {
        return "Params Routing is" + id;
    }


    @GetMapping("/items")
    public String getParamsItems(@RequestParam  int id)
    {
        return "Params Routing is" + id;
    }

    @PostMapping("/listss")
    public ResponseEntity<Object> bodyParser(@RequestBody List<String> item) {
    }
}