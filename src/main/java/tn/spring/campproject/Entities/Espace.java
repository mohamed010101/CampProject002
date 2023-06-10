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
    int IdEspace;

    String Nom;

    String Adresse;

    Type Nature;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Activite> ListActivites;
    @OneToMany
    public Set<Reclamation> ListReclamation;
    @OneToMany(mappedBy = "Espace")
    public Set<FeedBack> ListFeedback;
}
