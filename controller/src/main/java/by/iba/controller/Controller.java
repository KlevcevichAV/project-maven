package by.iba.controller;

import by.iba.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface Controller {

    @GetMapping("test")
    List<UserDto> findAll();

}
