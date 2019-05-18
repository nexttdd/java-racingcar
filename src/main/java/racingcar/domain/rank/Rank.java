package racingcar.domain.rank;

import racingcar.domain.car.Cars;

import java.util.List;

public class Rank {
    private Cars cars;

    public Rank(Cars cars) {
        this.cars = cars;
    }

    public Cars checkReulst() {
        return cars;
    }

    public List<String> findWinner() {
        return cars.findWinner();
    }
}
