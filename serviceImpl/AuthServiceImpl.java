package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    public static AuthService getInstance(){return instance;}
    @Override
    public String join(UserDto user) {

        return null;
    }

    @Override
    public String login(UserDto user) {
        return null;
    }

    @Override
    public UserDto findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(UserDto user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<UserDto> getUserList() {
        return null;
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미값 추가";

    }


}
