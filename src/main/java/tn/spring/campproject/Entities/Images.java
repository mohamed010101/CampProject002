package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.spring.campproject.Entities.ActivityType;

import javax.persistence.*;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdImage;

    String Chemin;

    @ManyToOne(cascade = CascadeType.ALL)
    ActivityType ActiviteType;
}
