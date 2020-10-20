package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
