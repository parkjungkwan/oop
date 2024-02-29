package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    public static AuthService getInstance(){return instance;}
    @Override
    public String join(UserDto user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String login(UserDto user) {
        return users.getOrDefault(user.getUsername(), new UserBuilder().password("").build())
                .getPassword()
                .equals(user.getPassword()) ?
                "로그인 성공" : "로그인 실패";
    }

    @Override
    public UserDto findUserById(String username) {
        return users.get(username)
                ;
    }

    @Override
    public String updatePassword(UserDto user) {
        users.get(user.getUsername()).setPassword(user.getPassword());

        return "비번 변경 성공";
    }

    @Override
    public String deleteUser(String username) {
        users.remove(username);
        return "회원삭제";
    }

    @Override
    public List<UserDto> getUserList() {
        return  new ArrayList<>(users.values());
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
        return users.size()+"";
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        return users;
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
        return users.size()+"개 더미값 추가";

    }


}
