package org.sid.delivryService_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Company {
    @Id
    private String id;
    private String designation;
    @ManyToOne
    private Boss boss;
    private String phone;
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;
    @OneToMany(mappedBy = "company")
    private List<DeliveryMan> deliveryMEN;
    private String email;
}
