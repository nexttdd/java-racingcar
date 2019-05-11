package racingcar.domain.car;

import java.util.Optional;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = checkName(name);
    }

    private String checkName(String racerName) {
        return Optional.ofNullable(racerName)
                .filter(name -> !name.trim().isEmpty())
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String toString() {
        return name;
    }
}