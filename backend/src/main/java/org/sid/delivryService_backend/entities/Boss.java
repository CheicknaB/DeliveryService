package org.sid.delivryService_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Boss extends User{
    @Id
    private String id;
    @OneToMany(mappedBy = "boss")
    private List<Company> companies;
}
