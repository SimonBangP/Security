package dat3.cars.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private int pricePerDay;
    private int bestDiscount;

    public Car(String brand, String model, int pricePerDay, int bestDiscount) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.bestDiscount = bestDiscount;
    }

    public Car() {
    }
}
