package arbalest.time;

import java.util.concurrent.atomic.AtomicLong;

import arbalest.time.beans.GetDayOfWeek;
import arbalest.time.beans.GetTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class OneController {

    private ApplicationContext context =
            new AnnotationConfigApplicationContext("arbalest.time.beans");
    private GetTime time = context.getBean(GetTime.class);
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public Model handlePost(Model model, @RequestParam(value="get", defaultValue="") String name) {
        if (name.equals("Now")){

            model.addAttribute("someString", "Точное время: " + time.getDateFormat());
        }
        else
            model.addAttribute("someString", "Нажмите, чтобы получить точное время");
        return model;
    }
    @PostMapping(value = "/helloPost", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public GetDayOfWeek helloPost() {
        return new GetDayOfWeek();
    }
}