package by.iba.service;

import by.iba.dto.UserDto;
import by.iba.dto.mapper.UserMapper;
import by.iba.repository.RestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class RestServiceImpl implements RestService {

    private final RestRepository repository;
    private final UserMapper mapper;

    public List<UserDto> test() {
        return repository
                .findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}

