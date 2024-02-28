package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import repository.UserRepository;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    Map<String, UserDto> users;

    public UserServiceImpl() {
        userRepository = new UserRepository();
        users = new HashMap<>();
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
        return users.size()+" 개 더미값 추가";
    }
}
