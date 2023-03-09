package web.dao;

import java.util.List;
import web.model.Car;

public interface CarDao {
    List<Car> getNCars(int n);
    List<Car> listCars();
}
