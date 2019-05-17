package racingcar.domain.rank;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.car.CarNames;
import racingcar.domain.car.Cars;
import racingcar.testmodule.ManualPower;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RankTest {

    private Cars cars;
    private Rank rank;

    @Before
    public void setUp() throws Exception {
        //given
        CarNames carNames = CarNames.newInstance("po,cu,jo");
        Cars cars = Cars.newInstance(carNames, new ManualPower());
        rank = new Rank(cars);
    }

    @Test
    public void Rank생성() {
        //then
        assertThat(rank).isNotNull();
    }

    @Test
    public void 우승자_확인() {
        //when
        List<String> winnersName = rank.findWinner();
        assertThat(winnersName.get(0)).isEqualTo("po");
    }
}