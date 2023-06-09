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
public class FeedBack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdFeedBack;

    Date DateFeedback;

    String DescriptionFeedback;

    String Categorie;

    @ManyToOne
    public Espace Espace;
}
