package racingcar.domain.car;

public class Car {
    private static final int DEFAULT_POSITION = 0;

    private CarName carName;
    private int position;

    public Car(int position) {
        this.position = position;
    }

    public Car(String name, int position) {
        this.carName = new CarName(name);
        this.position = position;
    }

    public static Car generate() {
        return new Car(DEFAULT_POSITION);
    }

    public static Car generateWithPosition(int position) {
        return new Car(position);
    }

    public static Car generate(String name) {
        return new Car(name, DEFAULT_POSITION);
    }

    public static Car generateWithPosition(String name, int position) {
        return new Car(name, position);
    }

    public void move(int distance) {
        this.position += distance;
    }

    public String getCarName() {
        return this.carName.toString();
    }

    public int getPosition() {
        return position;
    }
}