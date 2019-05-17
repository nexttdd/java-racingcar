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

    public static Cars newInstance(CarNames carNames, Power power) {
        List<Car> cars = new ArrayList<>();
        for (CarName carName : carNames.getCarNames()) {
            cars.add(Car.newInstance(carName));
        }

        return new Cars(cars, power);
    }

    public int size() {
        return this.cars.size();
    }

    public Cars move() {
        cars.forEach(car -> car.move(power.move()));
        return this;
    }

    public List<String> findWinner() {
        int maxPosition = findMaxPosition();
        List<String> winner = new ArrayList<>();

        for (Car car : cars) {
            car.isWinner(maxPosition, winner);
        }

        return winner;
    }

    private int findMaxPosition() {
        int maxPosition = -1;
        for (Car car : cars) {
            maxPosition = car.isMaxPosition(maxPosition);
        }
        return maxPosition;
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
