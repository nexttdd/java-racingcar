package racingcar.view;

import org.apache.commons.lang3.StringUtils;
import racingcar.domain.rank.Rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OutputView {
    private static final String PROGRESS_BAR = "-";

    public static void result(Integer times, Rank rank) {
        System.out.println("\n실행결과");

        for (int i = 1; i <= times; i++) {
            printStep(i, rank);
        }

        printWinner(rank);
    }

    private static void printStep(int step, Rank rank) {
        Map<String, Integer> result = rank.result();
        for (String carName : result.keySet()) {
            int position = result.get(carName);
            System.out.println(carName + " : " + StringUtils.repeat(PROGRESS_BAR, step > position ? position : step));
        }
        System.out.println();
    }

    private static void printWinner(Rank rank) {
        List<String> winner = rank.findWinner();
        System.out.println(String.join(", ", winner) + "가 최종 우승했습니다.");
    }
}