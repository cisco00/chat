package social.chat.model.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long friend_id;

    @OneToOne
    private User friend_of_friends;

    @OneToOne
    private User friendee;
}
