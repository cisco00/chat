package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.post.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
