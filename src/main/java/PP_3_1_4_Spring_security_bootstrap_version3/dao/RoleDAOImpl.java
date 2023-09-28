package PP_3_1_4_Spring_security_bootstrap_version3.dao;

import PP_3_1_4_Spring_security_bootstrap_version3.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @PersistenceContext
    private final EntityManager entityManager;

    @Autowired
    public RoleDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Role> findAll() {
        return entityManager.createQuery("from Roles", Role.class).getResultList();
    }

    @Override
    public Role getById(int id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public Set<Role> setRolesByIds(String rolesId) {
        Set<Role> roles = new HashSet<>();

        for(String string : rolesId.split(",")) {
            roles.add(getById(Integer.parseInt(string)));
        }

        return roles;
    }
}
