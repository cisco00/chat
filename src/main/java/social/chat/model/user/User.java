package social.chat.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import social.chat.model.post.Comment;
import social.chat.model.post.Image;
import social.chat.model.post.Post;
import social.chat.model.post.Video;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userid;

    @Column(nullable = false)
    private String fName;

    @Column(nullable = false)
    private String lName;

    private String userName;

    @Column(nullable = false)
    private String PhoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne
    private Address address;

    private Date dateOfBirth;

    private String profileUrl;

    @JsonIgnore
    private String password;

    private String banner;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author", cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToOne
    private Image image;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> allImages;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Video> videos;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Friend> friends;

    @OneToMany
    private List<Comment> comments;

}
