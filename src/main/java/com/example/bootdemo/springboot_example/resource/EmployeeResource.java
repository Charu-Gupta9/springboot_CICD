package com.example.bootdemo.springboot_example.resource;

import com.example.bootdemo.springboot_example.dto.EmployeeDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;

@RestController
@RequestMapping("/hello")
public class EmployeeResource {

    @GetMapping()
    public ResponseEntity greeting(@RequestParam String name){
        return ResponseEntity.ok("hello " + name);
    }

    @GetMapping("/{name}")
    public ResponseEntity greeting1(@PathVariable(name = "name") String name){
        return ResponseEntity.ok("hello " + name);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity greetings(@RequestBody EmployeeDto employee){
        return ResponseEntity.ok("Hello"+employee.getName());

    }
}
