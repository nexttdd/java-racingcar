package racingcar.domain.car;

import racingcar.domain.power.Power;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private List<Car> cars;
    private Power power;

    private Cars(List<Car> cars, Power power) {
        this.cars = cars;
        this.power = power;
    }

    public static Cars generate(int numberOfCars, Power power) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            cars.add(Car.generate());
        }

        return new Cars(cars, power);
    }

    public List<Car> move(int time) {
         for (int i = 0; i < time; i++) {
             cars.forEach(car -> car.move(power.move()));
         }

        return Collections.unmodifiableList(cars);
    }

    public int size() {
        return this.cars.size();
    }
}
