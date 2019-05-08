package racingcar.domain;

import org.junit.Test;
import racingcar.domain.car.CarNames;
import racingcar.domain.rank.Ranks;
import racingcar.testmodule.ManualPower;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    @Test
    public void racing_game() {
        //given
        CarNames carNames = CarNames.newInstance("po,cu,gu");
        int time = 1;
        RacingGame racingGame = RacingGame.generate(carNames, time, new ManualPower());

        //when
        Ranks ranks = racingGame.go();

        //then
        assertThat(ranks.findWinners().size()).isEqualTo(3);
    }
}