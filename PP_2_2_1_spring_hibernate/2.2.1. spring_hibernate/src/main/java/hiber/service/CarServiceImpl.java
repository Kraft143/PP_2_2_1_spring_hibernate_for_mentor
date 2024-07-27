package hiber.service;

import hiber.dao.CarDao;
import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Transactional
    @Override
    public void add(Car cars) {
        carDao.add(cars);

    }

    @Transactional
    @Override
    public User getUserByModelAndSeries(String model, int series) {


        return carDao.getCarByModelAndSeries(model, series).getUser();
    }
}
