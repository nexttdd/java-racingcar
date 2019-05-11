package racingcar.domain.rank;

import racingcar.domain.car.Car;

import java.util.*;

public class Rank {
    //TODO : 단계별 Cars를 저장하는 방식으로 개선,  poistion, maxPosition을 Car객체에 던져서 확인하는 방식 개선해보기

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

    public List<String> findWinners() {
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
