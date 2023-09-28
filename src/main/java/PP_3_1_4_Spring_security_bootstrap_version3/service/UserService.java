package PP_3_1_4_Spring_security_bootstrap_version3.service;

import PP_3_1_4_Spring_security_bootstrap_version3.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    void saveUser(User user);

    Optional<User> getUser(int id);

    void deleteUser(int id);

    void updateUser (User user);
    User findByUsername(String username);

    boolean isUniqueUsername(String username);
}
