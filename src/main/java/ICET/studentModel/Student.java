package ICET.studentModel;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Table(name="studentmgt")

@Entity
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer age;
private String name;

private String subject;
private  String email;

}
