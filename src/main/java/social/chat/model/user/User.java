package social.chat.model.user;

import net.minidev.json.annotate.JsonIgnore;
import social.chat.model.post.Post;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

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



}
