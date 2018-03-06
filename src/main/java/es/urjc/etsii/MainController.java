package es.urjc.etsii;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static java.lang.Thread.*;

@Controller
public class MainController {
    @RequestMapping("/")
    public String inicio(Map<String, Object> model){
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "index";
    }
}