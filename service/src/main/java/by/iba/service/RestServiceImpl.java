package by.iba.service;

import by.iba.dto.UserDto;
import by.iba.dto.mapper.UserMapper;
import by.iba.entity.User;
import by.iba.repository.RestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Service
public class RestServiceImpl implements RestService {

    private final RestRepository repository;
    private final UserMapper mapper;

    public List<UserDto> test() {
        List<User> usersList = repository.findAll();
        List<UserDto> result = new ArrayList<>();
        for (User user : usersList) {
            result.add(mapper.toDto(user));
        }
        return result;
    }

}

