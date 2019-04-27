package racingcar.domain.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void Car생성확인() {
        Car car = Car.generate();
        assertThat(car).isNotNull();
    }

    @Test
    public void 이동() {
        Car car = Car.generateWithPosition(2);
        car.move(1);
        assertThat(car.getPosition()).isEqualTo(3);
    }
}