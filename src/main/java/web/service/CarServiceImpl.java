package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars(int count) {
        List<Car> allCars= new ArrayList<>(5);
        allCars.add(new Car("hatchback", "Toyota", true));
        allCars.add(new Car("cabriolet", "Cadillac", false));
        allCars.add(new Car("limousine", "Volga", true));
        allCars.add(new Car("crossover", "Honda", true));
        allCars.add(new Car("caryto", "Lada", true));
        if (count >= 5) {
            return allCars;
        }
        return allCars.subList(1, count + 1);
    }
}
