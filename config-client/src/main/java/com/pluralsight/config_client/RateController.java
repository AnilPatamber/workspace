package com.pluralsight.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

    @Value("${greet}")
    String greet;

    @RequestMapping("/rate")
    public String getGreet(Model m) {
        System.out.println("greet----->" + greet);
        m.addAttribute("greet", greet);
        return "rateview";
    }

}
