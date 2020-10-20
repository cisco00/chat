package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.user.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long> {
}
