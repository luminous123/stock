package stock.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping({"/","/index"})
    public String showHomePage(Map<String,Object> model)
    {
        model.put("WelcomeWords", "hello world");
        //System.out.println("showHomepage executed, using stock");
        
        return "index";
    }
}
