package racingcar.domain.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNamesTest {
    @Test
    public void CarNames객체생성() {
        //given
        String names = "pobi,crong,honux";

        //when
        CarNames carNames = CarNames.newInstance(names);

        //then
        assertThat(carNames).isNotNull();
        assertThat(carNames.getCarNames().size()).isEqualTo(3);
    }
}