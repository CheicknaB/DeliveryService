package org.sid.delivryService_backend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.delivryService_backend.interfaces.IDelivery;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class FoodDelivryLine extends ADelivryLine{
    @Id
    private String id;
}
