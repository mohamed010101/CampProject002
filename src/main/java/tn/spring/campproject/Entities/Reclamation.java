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
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdReclamation;
    Date DateReclamation;
    String Description;
    String Statut;
    String Priorite;
    String PieceJointe;
    Date DateResolution;
    String Reponse;
    @ManyToOne(cascade = CascadeType.ALL)
    private Espace Espace;



}
