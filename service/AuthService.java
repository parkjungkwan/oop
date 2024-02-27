package service;

import model.UserDto;

import java.util.Map;

public interface AuthService {
    String join();
    String login();
    Map<String, UserDto> addUsers();
    void findUser(String username);
}
