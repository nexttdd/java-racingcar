package racingcar.domain.rank;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.car.Car;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RankTest {

    private List<Car> cars;
    private Rank rank;

    @Before
    public void setUp() throws Exception {
        //given
        cars = Arrays.asList(Car.generateWithPosition(1), Car.generateWithPosition(2));
        rank = Rank.generate(cars);
    }

    @Test
    public void rank생성() {
        //then
        assertThat(rank).isNotNull();
    }

    @Test
    public void 최종결과_확인() {
        //when
        List<Integer> result = rank.result();

        //then
        int idx = 0;
        for (Integer position : result) {
            assertThat(position).isEqualTo(++idx);
        }
    }
}