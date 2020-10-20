package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.post.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
