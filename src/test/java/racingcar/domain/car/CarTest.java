package racingcar.domain.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void Car생성확인() {
        //given
        String name = "hoho";
        Car car = Car.generate(name);

        //then
        assertThat(car).isNotNull();
        assertThat(car.getCarName()).isEqualTo(name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Car생성실패() {
        //given
        String name = "";

        //when
        Car car = Car.generate(name);
    }

    @Test
    public void 이동() {
        //given
        String name = "koko";
        Car car = Car.generateWithPosition(name, 2);

        //when
        car.move(1);

        //then
        assertThat(car.getPosition()).isEqualTo(3);
    }
}