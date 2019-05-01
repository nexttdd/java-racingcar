package racingcar;

import racingcar.domain.RacingGame;
import racingcar.domain.car.CarNames;
import racingcar.domain.power.RandomPower;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class ConsoleMain {
    public static void main(String[] args) {
        String names = InputView.inputRacingCars();
        Integer times = InputView.inputTimes();

        RacingGame racingGame2 = RacingGame.generate(CarNames.newInstance(names), times, new RandomPower());
        OutputView.result(times, racingGame2.go());
    }
}