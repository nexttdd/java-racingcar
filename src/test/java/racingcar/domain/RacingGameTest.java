package racingcar.domain;

import org.junit.Test;
import racingcar.domain.car.CarNames;
import racingcar.domain.rank.Rank;
import racingcar.testmodule.ManualPower;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
//    @Test
//    public void racing_game() {
//        //given
//        int numberOfCars = 3;
//        int time = 1;
//        RacingGame racingGame = RacingGame.newInstance(numberOfCars, time, new ManualPower());
//
//        //when
//        Rank rank = racingGame.go();
//
//        //then
//        for (int position : rank.result()) {
//            assertThat(position).isEqualTo(1);
//        }
//    }

    @Test
    public void racing_game2() {
        //given
        CarNames carNames = CarNames.newInstance("po,cu,gu");
        int time = 1;
        RacingGame racingGame = RacingGame.generate(carNames, time, new ManualPower());

        //when
        Rank rank = racingGame.go();

        //then
        for (int position : rank.result()) {
            assertThat(position).isEqualTo(1);
        }
    }
}