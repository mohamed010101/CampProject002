package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Espace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEspace;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;

    String nom;

    String adresse;
    @Enumerated(EnumType.STRING)
    Type nature;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Activite> ListActivites;
    @OneToMany
    public Set<Reclamation> ListReclamation;
    @OneToMany(mappedBy = "Espace")
    public Set<FeedBack> ListFeedback;
}
