package henry.waasep2022springdata.repo;

import henry.waasep2022springdata.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
}
