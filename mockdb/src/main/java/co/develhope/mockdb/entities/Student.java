package co.develhope.mockdb.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Student {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(unique = true)
    private String email;
}
