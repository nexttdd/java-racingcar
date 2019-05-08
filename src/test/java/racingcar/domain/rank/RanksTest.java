package racingcar.domain.rank;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RanksTest {

    private List<Car> step3Cars;
    private List<Car> step4Cars;

    @Before
    public void setUp() throws Exception {
        //given
        step3Cars = Arrays.asList(Car.newInstanceWithPosition(new CarName("one"), 2)
                            ,Car.newInstanceWithPosition(new CarName("two"), 3));

        step4Cars = Arrays.asList(Car.newInstanceWithPosition(new CarName("one"), 3)
                ,Car.newInstanceWithPosition(new CarName("two"), 4));
    }

    @Test
    public void 등록() {
        //when
        Ranks ranks = new Ranks();
        ranks.add(Rank.generate(step3Cars));
        ranks.add(Rank.generate(step4Cars));

        //then
        List<Rank> results = ranks.getResults();
        assertThat(results.size()).isEqualTo(2);
    }

    @Test
    public void 우승자찾기() {
        //given
        Ranks ranks = new Ranks();
        ranks.add(Rank.generate(step3Cars));
        ranks.add(Rank.generate(step4Cars));

        //when
        List<String> winners = ranks.findWinners();

        //then
        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0)).isEqualTo("two");
    }
}
