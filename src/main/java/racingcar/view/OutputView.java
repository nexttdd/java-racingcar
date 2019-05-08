package racingcar.view;

import org.apache.commons.lang3.StringUtils;
import racingcar.domain.car.CarName;
import racingcar.domain.car.CarNames;
import racingcar.domain.rank.Rank;
import racingcar.domain.rank.Ranks;

import java.util.List;
import java.util.Map;

public class OutputView {
    private static final String PROGRESS_BAR = "-";

    public static void result(CarNames carNames, Integer times, Ranks ranks) {
        List<Rank> results = ranks.getResults();

        for (int step = 0; step < times; step++) {
            printStep(carNames, step, results.get(step));
        }

        printWinner(ranks.findWinners());
    }

    private static void printStep(CarNames carNames, int step, Rank rank) {
        Map<String, Integer> result = rank.result();
        for (CarName carName : carNames.getCarNames()) {
            int position = result.get(carName.toString());
            System.out.println(carName + " : " + StringUtils.repeat(PROGRESS_BAR, position));
        }
        System.out.println();
    }

    private static void printWinner(List<String> winners) {
        System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
    }
}