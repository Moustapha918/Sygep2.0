package mr.mbconsulting.Sygep.repository;

import mr.mbconsulting.Sygep.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String userName);
    boolean existsByUsername(String userName);
}
