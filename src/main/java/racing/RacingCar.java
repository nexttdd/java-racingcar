package racing;

public class RacingCar {

    public static final int MOVE_MIN_COUNT = 4;
    int moveCount;

    public int move(int randomValue) {
        if(randomValue >= MOVE_MIN_COUNT )
           return moveCount+=1;
        return moveCount;
    }
}
