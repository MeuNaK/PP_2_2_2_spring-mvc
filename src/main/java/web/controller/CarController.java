package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    private final CarServiceImpl carService = new CarServiceImpl();

    @RequestMapping(value ="/cars")
    public String showAllCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {


        List<Car>  allCars = carService.getAllCars(count);

        //добавление машинок в модель в качестве атрибута с названием "allCars"
        model.addAttribute("allCars", allCars);

        return "cars";
    }
}
