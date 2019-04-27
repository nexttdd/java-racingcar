package racingcar.domain.rank;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import racingcar.domain.car.Car;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RankTest {

    @Test
    public void rank생성() {
        List<Car> cars = Arrays.asList(Car.generateWithPosition(1), Car.generateWithPosition(2));
        Rank rank = Rank.generate(cars);
        assertThat(rank).isNotNull();
    }

    @Test
    public void 최종결과_확인() {
        List<Car> cars = Arrays.asList(Car.generateWithPosition(1), Car.generateWithPosition(2));
        Rank rank = Rank.generate(cars);

        int idx = 0;
        for (Integer position : rank.result()) {
            assertThat(position).isEqualTo(++idx);
        }
    }

    @Test
    public void 결과출력() {
        List<Car> cars = Arrays.asList(Car.generateWithPosition(1), Car.generateWithPosition(2));
        Rank rank = Rank.generate(cars);

        for (int time = 1; time <= 3; time++) {
            for (int position : rank.result()) {
                System.out.println(StringUtils.repeat("-", time > position ? position : time));
            }
            System.out.println();
        }
    }
}
