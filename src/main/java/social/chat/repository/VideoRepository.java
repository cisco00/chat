package social.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.post.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {

}
