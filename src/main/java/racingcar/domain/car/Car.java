package racingcar.domain.car;

public class Car {
    private static final int DEFAULT_POSITION = 0;

    private int position;

    public Car(int position) {
        this.position = position;
    }

    public static Car generate() {
        return new Car(DEFAULT_POSITION);
    }

    public static Car generateWithPosition(int position) {
        return new Car(position);
    }

    public void move(int distance) {
        this.position += distance;
    }

    public int getPosition() {
        return position;
    }
}
