package PP_3_1_4_Spring_security_bootstrap_version3.service;

import PP_3_1_4_Spring_security_bootstrap_version3.dao.RoleDAO;
import PP_3_1_4_Spring_security_bootstrap_version3.models.Role;
import PP_3_1_4_Spring_security_bootstrap_version3.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    private final RoleDAO roleDAO;

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleDAO roleRepository, RoleRepository roleRepository1) {
        this.roleDAO = roleRepository;
        this.roleRepository = roleRepository1;
    }


    @Override
    public Role getById(int id) {
        return roleDAO.getById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Role> listRoles() {
        return roleRepository.findAllBy();
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Set<Role> setRolesByIds(String rolesId) {
//        return roleDAO.setRolesByIds(rolesId);
//    }
}
