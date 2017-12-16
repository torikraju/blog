package org.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping(value = "/registration")
    public String showRegistrationPage(){
        return "authentication/registration";
    }
}
