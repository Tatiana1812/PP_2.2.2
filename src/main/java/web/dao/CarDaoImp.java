package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao{
    List<Car> cars = new ArrayList<>(Arrays.asList(
        new Car("Darina","BMW-X6", 891),
        new Car("Ksenia","Mercedes c-class", 111),
        new Car("Tatiana","Lexus", 777),
        new Car("Ivan","Toyota", 88),
            new Car("Yura","Peugeot", 981),
            new Car("Karina","Porshe", 33)));
    @Override
    public List<Car> getNCars(int n) {
        if(n>0 && n<cars.size()){
            return cars.subList(0,n);
        } else return cars;
    }
    @Override
    public List<Car> listCars() {
        return cars;
    }
}
