package tn.spring.campproject.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ActivityType {

    //Identifier of the activity's type
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdActivityType;

    //Description for the activity
    String Description;

    //the level of the activity
    String Level;

    //duration of the activity
    int Duration;

    //Cost of the activity
    float ActivityCost;

    //1 Participant fee for the activity
    float ActivityFee;

    // minimal Age
    int MinAge;

    //Gender allowed
    String Gender;

    //Max participant number
    int MaxParticipantNbr;

    @OneToMany(mappedBy = "ActiviteType")
    public Set<Activite> Activites;
    @OneToMany(mappedBy="ActiviteType")
    public Set<Images> ListImages;


}

