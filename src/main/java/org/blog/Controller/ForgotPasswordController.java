package org.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForgotPasswordController {

    @RequestMapping(value = "/forgot-password")
    public String showForgotPasswordPage(){
        return "authentication/forgot-password";
    }
}
