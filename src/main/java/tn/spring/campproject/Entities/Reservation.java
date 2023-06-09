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
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdReservation;

    Date DateDebut;

    Date DateFin;

    TypeStatut Statut;

    @ManyToOne(cascade = CascadeType.ALL)
    Personne personne;
    @ManyToOne
    Activités Activite;
}
