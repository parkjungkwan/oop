package service;

import model.UserDto;

import java.util.List;

public interface UserService {
    String addUsers();
    String join(UserDto user);
    String login(UserDto user);
    UserDto findUserById(String username);
    String updatePassword(UserDto user);
    String deleteUser(String username);
    List<UserDto> getUserList();
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);
    String countUsers();

}
