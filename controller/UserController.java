package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    public void addUsers(){
        AuthServiceImpl.getInstance().addUsers();
    }


}
