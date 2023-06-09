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
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdCommande;

    Date DateCommande;
    String statut;

    Float MontantTotal;
    String AdresseLivraison;
    String ModePayement;
    String Commentaire;


    @ManyToOne(cascade = CascadeType.ALL)
    Personne personne;

    @ManyToMany(mappedBy="ListCommandes" , cascade = CascadeType.ALL)
    private Set<Produits> ListProduits;


}
