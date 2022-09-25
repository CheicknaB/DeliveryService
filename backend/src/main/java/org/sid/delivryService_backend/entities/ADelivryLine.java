package org.sid.delivryService_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.delivryService_backend.interfaces.IDelivery;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ADelivryLine {
    @Id
    private String id;
    private String status;
    @ManyToOne
    private IDelivery iDelivery;
}
