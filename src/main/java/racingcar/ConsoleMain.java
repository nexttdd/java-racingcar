package racingcar;

import racingcar.domain.RacingGame;
import racingcar.domain.power.RandomPower;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class ConsoleMain {

    public static void main(String[] args) {
        Integer numberOfCars = InputView.inputNumberOfCars();
        Integer times = InputView.inputTimes();

        RacingGame racingGame = RacingGame.generate(numberOfCars, times, new RandomPower());
        OutputView.result(times, racingGame.go());
    }
}