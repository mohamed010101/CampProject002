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
public class Activités {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdActivite;

    String Nom;

    Date DateDebut;

    Date DateFin;

    int NbrParticipantsActuel;

    int NbrReservation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Activite")
    private Set<Reservation> Reservations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Activite")
    private Set<Rate> Rates;
    @ManyToMany(mappedBy="ListActivites", cascade = CascadeType.ALL)
    private Set<Espace> ListEspaces;

    @ManyToOne
    public ActivityType ActiviteType;
}
