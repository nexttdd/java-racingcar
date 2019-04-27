package racingcar.domain.power;

import org.junit.Test;
import racingcar.testmodule.ManualPower;

import static org.assertj.core.api.Assertions.assertThat;

public class PowerTest {

    private Power power;

    @Test
    public void 전진() {
        this.power = new ManualPower();
        assertThat(this.power.move()).isEqualTo(1);
    }

    @Test
    public void 랜덤_이동() {
        this.power = new RandomPower();
        assertThat(power.move()).isBetween(0, 1);
    }
}
