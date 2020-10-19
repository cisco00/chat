package social.chat.model.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import social.chat.model.user.User;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor



@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String commentBody;

    @OneToOne
    private User commentsAuthor;


}
