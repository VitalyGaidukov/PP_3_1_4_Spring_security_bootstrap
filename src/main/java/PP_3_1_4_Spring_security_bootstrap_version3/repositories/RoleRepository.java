package PP_3_1_4_Spring_security_bootstrap_version3.repositories;

import PP_3_1_4_Spring_security_bootstrap_version3.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findAllBy();
}
