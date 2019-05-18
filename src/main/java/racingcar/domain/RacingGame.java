package racingcar.domain;

import racingcar.domain.car.CarNames;
import racingcar.domain.car.Cars;
import racingcar.domain.power.Power;
import racingcar.domain.rank.Rank;
import racingcar.view.OutputView;

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
        for (int i = 0; i < time; i++) {
            cars.move();
            OutputView.printStatus(cars);
        }
        return new Rank(cars);
    }
}
