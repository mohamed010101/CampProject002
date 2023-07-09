package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

            int IdSujet;

    String Titre;
    String Contenu;

    Date DateCreationSujet;

        String CreerPar;

    Date DateValidation;

        String ValideePar;

    @ManyToMany(mappedBy="ListSujets" , cascade = CascadeType.ALL)
    private Set<Personne> ListPersonnes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="sujet")
    private Set<Commentaire> ListCommentaires;
}
