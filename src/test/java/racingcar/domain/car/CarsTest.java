package racingcar.domain.car;

import org.junit.Before;
import org.junit.Test;
import racingcar.testmodule.ManualPower;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @Before
    public void setUp() throws Exception {
        //given, when
        CarNames carNames = CarNames.newInstance("pobi,cogi,denver");
        cars = Cars.newInstance(carNames, new ManualPower());
    }

    @Test
    public void Cars객체생성() {
        //then
        assertThat(cars).isNotNull();
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    public void n대_모두이동() {
        //when
        cars.move();

        //then
        for (Car car : cars.getCars()) {
            assertThat(car.getPosition()).isEqualTo(1);
        }
    }
}