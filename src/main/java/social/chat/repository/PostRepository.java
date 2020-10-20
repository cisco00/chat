package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.post.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
