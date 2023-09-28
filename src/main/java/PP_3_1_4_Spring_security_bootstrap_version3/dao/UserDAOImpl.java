package PP_3_1_4_Spring_security_bootstrap_version3.dao;

import PP_3_1_4_Spring_security_bootstrap_version3.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        Query queue = entityManager.createQuery("delete from User u where u.id =:id");
        queue.setParameter("id", id);
        queue.executeUpdate();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public User findByUsername(String username){
        User user = entityManager.createQuery(
                        "SELECT u from User u WHERE u.name = :username", User.class).
                setParameter("username", username).getSingleResult();
        return user;
    }
}
