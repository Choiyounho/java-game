package game;

public interface UserRepository {

    String NAME_CODE = "00001";

    User save(User user);
    User update();
    void delete();
    User findById();
}