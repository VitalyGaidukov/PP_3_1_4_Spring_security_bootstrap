package PP_3_1_4_Spring_security_bootstrap_version3.dao;

import PP_3_1_4_Spring_security_bootstrap_version3.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    void updateUser (User user);

    User findByUsername(String username);
}
