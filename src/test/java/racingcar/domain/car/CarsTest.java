package racingcar.domain.car;

import org.junit.Test;
import racingcar.testmodule.ManualPower;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    public void n대만큼_자동차생성() {
        int numberOfCars = 5;
        Cars cars = Cars.generate(numberOfCars, new ManualPower());
        assertThat(cars).isNotNull();
        assertThat(cars.size()).isEqualTo(5);
    }

    @Test
    public void n대_모두이동() {
        int numberOfCars = 3;
        Cars cars = Cars.generate(numberOfCars, new ManualPower());
        List<Car> positions = cars.move(4);

        for (Car car : positions) {
            assertThat(car.getPosition()).isEqualTo(4);
        }
    }
}
