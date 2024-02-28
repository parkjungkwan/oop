package controller;

import model.UserDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserController {

    UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    public String addUsers() {
        String msg = userService.addUsers();
        return msg;
    }
}
