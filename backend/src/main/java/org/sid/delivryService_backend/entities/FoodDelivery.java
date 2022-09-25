package org.sid.delivryService_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.delivryService_backend.interfaces.IDelivery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class FoodDelivery implements IDelivery {
    @Id
    private String id;
    @OneToMany(mappedBy = "iDelivery")
    private List<FoodDelivryLine> foodDelivryLineList;
}
