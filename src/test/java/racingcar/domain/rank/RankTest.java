package racingcar.domain.rank;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RankTest {

    private List<Car> cars;
    private Rank rank;

    @Before
    public void setUp() throws Exception {
        //given
        cars = Arrays.asList(Car.newInstanceWithPosition(new CarName("pobi"), 2), Car.newInstanceWithPosition(new CarName("cong"), 3));
        rank = Rank.generate(cars);
    }

    @Test
    public void Rank생성() {
        //then
        assertThat(rank).isNotNull();
    }

    @Test
    public void 우승자_확인() {
        //when
        List<String> winnersName = rank.findWinners();
        assertThat(winnersName.get(0)).isEqualTo("cong");
    }
}