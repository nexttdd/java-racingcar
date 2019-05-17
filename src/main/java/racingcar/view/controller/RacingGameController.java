package racingcar.view.controller;

import racingcar.domain.RacingGame;
import racingcar.domain.car.CarNames;
import racingcar.domain.power.RandomPower;
import racingcar.domain.rank.Rank;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * 세션 - 객체형태로 저장. 서버 메모리 생각해야함. 사용자 많아지면 메모리 사용량 늘어.
 * <p>
 * 세션에 대한 이해
 * https://hyeonstorage.tistory.com/125
 * https://okky.kr/article/314611
 * <p>
 * SLiPP - session의 활용. 어떻게 활용하시나요~? 공유해보아요.
 * https://www.slipp.net/questions/258
 */
public class RacingGameController {

    public RacingGameController() {
        name();
        result();
    }

    private void name() {
        post("/name", (req, res) -> {
            String names = req.queryParams("names");
            CarNames carNames = CarNames.newInstance(names, " ");
            req.session().attribute("carNames", carNames);

            Map<String, Object> model = new HashMap<>();
            model.put("carNames", carNames);

            return render(model, "game.html");
        });
    }

    private void result() {
        get("/result", (req, res) -> {
            int turn = Integer.parseInt(req.queryParams("turn"));
            CarNames carNames = req.session().attribute("carNames");
            RacingGame racingGame = RacingGame.generate(carNames, turn, new RandomPower());
            Rank rank = racingGame.go();
            Map<String, Object> model = new HashMap<>();
            model.put("result", rank.checkReulst().getCars());
            model.put("winner", printWinners(rank.findWinner()));
            return render(model, "result.html");
        });
    }

    private String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

    private String printWinners(List<String> winner) {
        return String.join(", ", winner) + "가 최종 우승했습니다.";
    }
}