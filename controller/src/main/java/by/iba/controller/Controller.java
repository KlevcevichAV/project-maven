package by.iba.controller;

import by.iba.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/test")
public interface Controller {

    @GetMapping()
    ResponseEntity<List<UserDto>> findAll();

}
