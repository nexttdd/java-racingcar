package racingcar.domain.power;

import java.util.Optional;
import java.util.Random;

public class RandomPower implements Power {

    private static final int BOUND = 10;
    private static final int GO = 1;
    private static final int STOP = 0;

    private Random random;

    public RandomPower() {
        this.random = new Random();
    }

    @Override
    public int move() {
        return determinePower();
    }

    private int determinePower() {
        return Optional.of(random.nextInt(BOUND))
                .filter(power -> power > 3)
                .map(integer -> GO)
                .orElse(STOP);
    }
}
