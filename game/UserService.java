package game;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save() {
        User user = new User("email", "0100919");
        return userRepository.save(user);
    }
}
