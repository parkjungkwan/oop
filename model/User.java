package model;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String username;
    private String password;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;



}
