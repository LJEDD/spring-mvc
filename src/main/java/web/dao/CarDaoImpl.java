package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Auto 1", "black", 2007, 700_000));
        carList.add(new Car("Auto 2", "green", 2015, 800_000));
        carList.add(new Car("Auto 3", "white", 2012, 900_000));
        carList.add(new Car("Auto 4", "grey", 2017, 1000_000));
        carList.add(new Car("Auto 5", "pink", 2013, 1100_00));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
