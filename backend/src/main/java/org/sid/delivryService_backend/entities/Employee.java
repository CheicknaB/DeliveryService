package org.sid.delivryService_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee extends User{
    @Id
    private String id;
    private String gender;
    private String phone;
    private String address;
    private double  salary;
    @ManyToOne
    private Company company;
}
