package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.post.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
