package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserController {

    private Map<String, UserDto> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public void addUsers(){
        AuthService auth = AuthServiceImpl.getInstance();
        users = auth.addUsers();

    }
    public void findUser(String username){
        System.out.println(users.get(username).toString());
    }
}
