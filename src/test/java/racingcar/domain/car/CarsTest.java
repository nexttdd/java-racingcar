package racingcar.domain.car;

import org.junit.Before;
import org.junit.Test;
import racingcar.testmodule.ManualPower;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @Before
    public void setUp() throws Exception {
        //given
        cars = Cars.generate(5, new ManualPower());
    }

    @Test
    public void n대만큼_자동차생성() {
        //then
        assertThat(cars).isNotNull();
        assertThat(cars.size()).isEqualTo(5);
    }

    @Test
    public void n대_모두이동() {
        //when
        List<Car> positions = cars.move(4);

        //then
        for (Car car : positions) {
            assertThat(car.getPosition()).isEqualTo(4);
        }
    }
}