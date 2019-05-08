package racingcar.domain.car;

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

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.carName.toString();
    }
}