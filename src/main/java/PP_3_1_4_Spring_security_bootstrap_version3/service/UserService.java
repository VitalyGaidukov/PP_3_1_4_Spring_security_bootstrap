package PP_3_1_4_Spring_security_bootstrap_version3.service;

import PP_3_1_4_Spring_security_bootstrap_version3.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    //void updateUser (User user, String role);
    void updateUser (User user);
    User findByUsername(String username);

    boolean isUniqueUsername(String username);
}
