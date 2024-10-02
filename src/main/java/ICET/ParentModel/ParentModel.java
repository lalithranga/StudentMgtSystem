package ICET.ParentModel;


import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="parentmgt")

public class ParentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private  String name;
    private String contactNumber;
}
