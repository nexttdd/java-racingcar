package racingcar.view;

import org.apache.commons.lang3.StringUtils;
import racingcar.domain.rank.Rank;

public class OutputView {
    private static final String PROGRESS_BAR = "-";

    public static void result(Integer times, Rank rank) {
        System.out.println("\n실행결과");

        for (int i = 1; i <= times; i++) {
            printStep(i, rank);
        }
    }

    private static void printStep(int step, Rank rank) {
        for (Integer position : rank.result()) {
            System.out.println(StringUtils.repeat(PROGRESS_BAR, step > position ? position : step));
        }
        System.out.println();
    }
}