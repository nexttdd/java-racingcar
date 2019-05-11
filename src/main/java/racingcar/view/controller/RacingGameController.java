package racingcar.view.controller;

import racingcar.domain.car.CarNames;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.post;

public class RacingGameController {

    public RacingGameController() {
        name();
    }

    private void name() {
        post("/name", (req, res) -> {
            String names = req.queryParams("names");
            CarNames carNames = CarNames.newInstance(names, " ");

            Map<String, Object> model = new HashMap<>();
            model.put("carNames", carNames);

            return render(model, "game.html");
        });
    }

    private String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
