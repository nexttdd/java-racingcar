package racingcar.domain;

import org.junit.Test;
import racingcar.domain.RacingGame;
import racingcar.domain.rank.Rank;
import racingcar.testmodule.ManualPower;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    public void racing_game() {
        int numberOfCars = 3;
        int time = 1;

        RacingGame racingGame = RacingGame.generate(numberOfCars, time, new ManualPower());
        Rank rank = racingGame.go();

       for (int position : rank.result()) {
           assertThat(position).isEqualTo(1);
       }
    }
}
