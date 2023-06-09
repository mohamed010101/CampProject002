package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdCompte;

    String UserName;

    String Password;

    @OneToOne(mappedBy = "compte")
    public Personne personne;

    @ManyToOne
    public Personne Admin;

}
