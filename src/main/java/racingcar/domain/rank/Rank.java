package racingcar.domain.rank;

import racingcar.domain.car.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rank {
    private List<Integer> positions;

    private Rank(List<Integer> positions) {
        this.positions = positions;
    }

    public static Rank generate(List<Car> cars) {
        List<Integer> positions = new ArrayList<>();
        for (Car car : cars) {
            positions.add(car.getPosition());
        }
        return new Rank(positions);
    }

    public List<Integer> result() {
        return Collections.unmodifiableList(positions);
    }
}
