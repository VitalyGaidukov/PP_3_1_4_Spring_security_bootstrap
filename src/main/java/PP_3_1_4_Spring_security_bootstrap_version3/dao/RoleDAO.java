package PP_3_1_4_Spring_security_bootstrap_version3.dao;


import PP_3_1_4_Spring_security_bootstrap_version3.models.Role;

import java.util.List;
import java.util.Set;


public interface RoleDAO {
    List<Role> findAll();
    Role getById(int id);

    public Set<Role> setRolesByIds(String rolesId);
}
