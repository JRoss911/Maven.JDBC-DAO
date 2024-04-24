package models;

import daos.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CarDao implements Dao<Car> {

    private List<Car> cars = new ArrayList<>();

    public CarDao() {
        cars.add(new Car(1654181, "Mazda", "6", 2016, "brown"));
        cars.add(new Car(2578315, "Ford", "Explorer", 2017, "silver"));
    }


    @Override
    public Optional<Car> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Car> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void create(Car car) {
        cars.add(car);
    }


    @Override
    public void update(Car car, String[] params) {
        car.setMake(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        car.setModel(Objects.requireNonNull(
                params[1], "Make cannot be null"));

        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }
}