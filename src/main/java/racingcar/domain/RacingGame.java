package racingcar.domain;

import racingcar.domain.car.CarNames;
import racingcar.domain.car.Cars;
import racingcar.domain.power.Power;
import racingcar.domain.rank.Rank;

public class RacingGame {
    private Cars cars;
    private int time;

    public RacingGame(Cars cars, int time) {
        this.cars = cars;
        this.time = time;
    }

    public static RacingGame generate(CarNames carNames, int time, Power power) {
        Cars cars = Cars.newInstance(carNames, power);
        return new RacingGame(cars, time);
    }

    public Rank go() {
        return Rank.generate(cars.move(time));
    }
}
