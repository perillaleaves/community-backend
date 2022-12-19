package perillaleaves.community.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import perillaleaves.community.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLoginId(String login_id);

    Optional<User> findByPhoneNumber(String phone_number);

    Optional<User> findByEmail(String email);

}
