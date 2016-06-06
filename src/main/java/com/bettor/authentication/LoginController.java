package com.bettor.authentication;


import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    public static final String LOGIN_PATH = "/login";
    public static final String LOGIN_VIEW = "authentication/login";

    @RequestMapping(value = LOGIN_PATH, method = RequestMethod.GET)
    public CompletableFuture<ModelAndView> index() {
        final ModelAndView mav = new ModelAndView(LOGIN_VIEW);
        return CompletableFuture.completedFuture(mav);
    }
}
