package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

public interface CarDao {
    void add(Car cars);
    Car getCarByModelAndSeries(String model, int series);

}
