package racingcar.domain.power;

import org.junit.Test;
import racingcar.testmodule.ManualPower;

import static org.assertj.core.api.Assertions.assertThat;

public class PowerTest {
    private Power power;

    @Test
    public void 전진() {
        //given
        this.power = new ManualPower();

        //when, then
        assertThat(this.power.move()).isEqualTo(1);
    }

    @Test
    public void 랜덤_이동() {
        //given
        this.power = new RandomPower();

        //when, then
        assertThat(power.move()).isBetween(0, 1);
    }
}