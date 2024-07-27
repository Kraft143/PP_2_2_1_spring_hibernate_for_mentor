package hiber.service;

import hiber.model.Car;
import hiber.model.User;

public interface CarService {


    void add(Car cars);
    User getUserByModelAndSeries(String model, int series);


}
