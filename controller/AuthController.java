package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;

public class AuthController {

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join() {

        return auth.join();
    }

    public String login() {
        return  auth.login();
    }

    public void addUsers() {
        auth.addUsers();
    }

    public void findUser(String username) {
        auth.findUser(username);
    }

    public Map<String, UserDto> getUserMap() {
        return auth.getUserMap();
    }
}
