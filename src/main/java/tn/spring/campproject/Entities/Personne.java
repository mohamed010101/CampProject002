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
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdPersonne;

    String Nom;

    String Prenom;
    String CIN;
    String email;
    Date DateNaissance;
    Boolean Role;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="personne")
    private Set<Commande> Commandes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="personne")
    private Set<Facture> Factures;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Sujet> ListSujets;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="personne")
    private Set<Reservation> Reservations;

    @OneToOne
    public Compte compte;

    @OneToMany(mappedBy = "Admin")
    public Set<Compte> ListComptes;

}
