package racingcar.domain.rank;

import racingcar.domain.car.Car;

import java.util.*;

public class Rank {
    private Map<String, Integer> result;

    public Rank(Map<String, Integer> result) {
        this.result = result;
    }

    public static Rank generate(List<Car> cars) {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : cars) {
            result.put(car.toString(), car.getPosition());
        }
        return new Rank(result);
    }

    public Map<String, Integer> result() {
        return Collections.unmodifiableMap(result);
    }

    public List<String> findWinner() {
        int maxPosition = findMaxPosition();
        List<String> winner = new ArrayList<>();

        result.forEach((carName, position) -> {
            if (maxPosition == position) {
                winner.add(carName);
            }
        });

        return Collections.unmodifiableList(winner);
    }

    private int findMaxPosition() {
        int maxPosition = -1;

        for (Integer position : result.values()) {
            maxPosition = position > maxPosition ? position : maxPosition;
        }

        return maxPosition;
    }
}
