package service;

import model.UserDto;

import java.util.List;
import java.util.Map;

public interface AuthService {
    String join();
    String login();
    void addUsers();
    void findUser(String username);
    Map<String, UserDto> getUserMap();
}
