package racingcar;

import racingcar.view.controller.RacingGameController;
import spark.Spark;

public class WebMain {
    public static void main(String[] args) {
        Spark.staticFiles.location("templates");
        new RacingGameController();
    }
}
