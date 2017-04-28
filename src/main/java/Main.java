import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

/**
 * Created by Pirat on 2017-04-28.
 */
public class Main {

    public static void main(String[] args) {

        get("/*", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World");

            return new ModelAndView(attributes, "spark.template/freemarker/hello.ftl");
        }, new FreeMarkerEngine());
    }
}
