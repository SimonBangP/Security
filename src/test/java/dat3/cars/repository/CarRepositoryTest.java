package dat3.cars.repository;

import dat3.cars.entity.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;


    static int car1Id;

    static int car2Id;


    @BeforeAll
    public static void testSetUpData (@Autowired CarRepository carRepository){
        Car car1 = new Car("aBrand", "aModel", 300, 2000 );
        Car car2 = new Car("bBrand", "bModel", 200, 4000 );

        carRepository.save(car1);
        carRepository.save(car2);
        car1Id = car1.getId();
        car2Id = car2.getId();



    }

    @Test
    public void findCarByModel (){
        Car found = carRepository.findById(car1Id).get();
        assertEquals("aModel", found.getModel());
    }



    @Test
    public void testFindById (){
        Car carFound = carRepository.findById(car1Id).get();
        assertEquals(car1Id, carFound);

    }


}