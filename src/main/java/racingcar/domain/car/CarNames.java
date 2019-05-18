package racingcar.domain.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarNames {
    private List<CarName> carNames;

    private CarNames(List<CarName> carNames) {
        this.carNames = carNames;
    }

    public static CarNames newInstance(String inputNames) {
        String[] names = inputNames.split(",");
        List<CarName> carNames = new ArrayList<>();
        for (String name : names) {
            carNames.add(new CarName(name));
        }
        return new CarNames(carNames);
    }

    public static CarNames newInstance(String inputNames, String delimeter) {
        String[] names = inputNames.split(delimeter);
        List<CarName> carNames = new ArrayList<>();
        for (String name : names) {
            carNames.add(new CarName(name));
        }
        return new CarNames(carNames);
    }

    public List<CarName> getCarNames() {
        return Collections.unmodifiableList(carNames);
    }
}
