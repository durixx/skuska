package com.example.jebbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PC on 05.11.2017.
 */

@Controller
@RestController
public class Home {

    @RequestMapping("/")
    public String getasd(){
        return "das";
    }
}
