package game;

public class User {
    private String name;
    private int birthDay;
    private String userId;
    private String password;
    private String passwordConfirm;
    private int phone;
    private String email;

    public User(String name, int birthDay, String userId, String password, String passwordConfirm, int phone, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.userId = userId;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.phone = phone;
        this.email = email;
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public User(String name, int birthDay, int phone) {
        this.name = name;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    public User(String userId, String name, int birthDay, int phone) {
        this.userId = userId;
        this.name = name;
        this.birthDay = birthDay;
        this.phone = phone;
    }


}
