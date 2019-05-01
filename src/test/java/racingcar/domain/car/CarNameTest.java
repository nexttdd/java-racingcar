package racingcar.domain.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNameTest {
    @Test(expected = IllegalArgumentException.class)
    public void 비정상이름_오류발생() {
        //given
        String name = "";
        //when
        CarName carName = new CarName(name);
    }

    @Test
    public void 정상적인이름_Racer객체생성() {
        //given
        String name = "koo";
        //when
        CarName carName = new CarName(name);
        //then
        assertThat(carName.toString()).isEqualTo(name);
    }
}
