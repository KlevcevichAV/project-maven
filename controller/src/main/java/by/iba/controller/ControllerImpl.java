package by.iba.controller;

import by.iba.dto.UserDto;
import by.iba.service.RestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerImpl implements Controller{

    private final RestService service;

    @Override
    public ResponseEntity<List<UserDto>> findAll() {

        return ResponseEntity
                .ok()
                .body(service.test());
    }

}
