package racingcar.domain.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void Car생성확인() {
        //given
        Car car = Car.generate();

        //then
        assertThat(car).isNotNull();
    }

    @Test
    public void 이동() {
        //given
        Car car = Car.generateWithPosition(2);

        //when
        car.move(1);

        //then
        assertThat(car.getPosition()).isEqualTo(3);
    }
}