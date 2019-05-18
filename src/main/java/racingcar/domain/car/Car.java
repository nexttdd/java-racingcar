package racingcar.domain.car;

import java.util.List;

public class Car {
    private static final int DEFAULT_POSITION = 0;

    private CarName carName;
    private int position;

    public Car(CarName carName, int position) {
        this.carName = carName;
        this.position = position;
    }

    public static Car newInstance(CarName carName) {
        return new Car(carName, DEFAULT_POSITION);
    }

    public static Car newInstanceWithPosition(CarName carName, int position) {
        return new Car(carName, position);
    }

    public void move(int distance) {
        this.position += distance;
    }

    public int isMaxPosition(int maxPosition) {
        return maxPosition < position ? position : maxPosition;
    }

    public void isWinner(int maxPosition, List<String> winner) {
        if (maxPosition == position) {
            winner.add(carName.getName());
        }
    }

    public String getCarName() { return carName.getName(); }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.carName.toString();
    }
}