package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdFacture;
    Float MontantFacture;

    Float MontantRemise;

    Date DateFacture;
    @ManyToOne(cascade = CascadeType.ALL)
    Personne personne;
}
