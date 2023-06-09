package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.spring.campproject.Entities.Commande;
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
public class Produits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdProduit;

    String Libelle;

    String Code;

    Float Prix;
    Date DateCreation;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Commande> ListCommandes;

}
