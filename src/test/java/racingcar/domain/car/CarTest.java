package racingcar.domain.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void Car객체생성() {
        //given
        String name = "pobi";
        CarName carName = new CarName(name);

        //when
        Car car = Car.newInstance(carName);

        //then
        assertThat(car.toString()).isEqualTo(name);
    }

    @Test
    public void 이동() {
        //given
        String name = "koko";
        CarName carName = new CarName(name);
        Car car = Car.newInstanceWithPosition(carName, 2);

        //when
        car.move(1);

        //then
        assertThat(car.getPosition()).isEqualTo(3);
    }
}