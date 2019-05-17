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

        CarNames carNames = CarNames.newInstance(names);

        RacingGame racingGame = RacingGame.generate(carNames, times, new RandomPower());
        OutputView.printWinner(racingGame.go());
    }
}