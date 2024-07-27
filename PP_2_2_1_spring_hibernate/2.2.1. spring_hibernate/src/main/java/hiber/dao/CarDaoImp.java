package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImp implements CarDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void add(Car cars) {
        sessionFactory.getCurrentSession().save(cars);

    }

    @Override
    public Car getCarByModelAndSeries(String model, int series) {
        String query = "FROM Car c WHERE c.model = :model AND c.series = :series";
        Query<Car> q = sessionFactory.getCurrentSession().createQuery(query, Car.class);

        q.setParameter("model", model);
        q.setParameter("series", series);

       // query=sessionFactory.getCurrentSession().createQuery("from Car");

        return q.uniqueResult();
    }
}
