package ng.com.nokt.demo_Jethro.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicle  {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    private String name;
    private String plateNumber;
    private String status;
    private String type;
    private float fuelCapacity;
    private float carryingWeight;

    @OneToMany
    private List<Item> items;

}
