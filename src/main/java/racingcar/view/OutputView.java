package racingcar.view;

import org.apache.commons.lang3.StringUtils;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;
import racingcar.domain.rank.Rank;

import java.util.List;

public class OutputView {
    private static final String PROGRESS_BAR = "-";

    public static void printStatus(Cars cars) {
        System.out.println("실행 결과");

        for (Car car : cars.getCars()) {
            System.out.println(car.toString() + " : " + StringUtils.repeat(PROGRESS_BAR, car.getPosition()));
        }
        System.out.println();
    }

    public static void printWinner(Rank rank) {
        List<String> winner = rank.findWinner();
        System.out.println(String.join(", ", winner) + "가 최종 우승했습니다.");
    }
}