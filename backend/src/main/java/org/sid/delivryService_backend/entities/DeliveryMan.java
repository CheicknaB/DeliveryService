package org.sid.delivryService_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class DeliveryMan {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String address;
    @ManyToOne
    private Company company;
}
