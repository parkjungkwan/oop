package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    private AuthServiceImpl(){}
    public static AuthService getInstance(){return instance;}
    @Override
    public String join() {
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public Map<String, UserDto> addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        String username = util.createRandomUsername();
        for(int i=0; i<5; i++){
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        return map;

    }

    @Override
    public void findUser(String username) {

    }
}
