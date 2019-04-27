package racingcar.testmodule;

import racingcar.domain.power.Power;

public class ManualPower implements Power {
    @Override
    public int move() {
        return 1;
    }
}
