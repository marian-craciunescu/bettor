package com.bettor.authentication;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;

import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private final CounterService counterService;
    private static final String FORM = "register_form";
    public static final String VIEW = "security/login";
    public static final String PATH = "/login";
    public static final String HOME_PAGE_PATH = "/";
    public static final String HOME_PAGE_VIEW = "authentication/home_page";

    @Inject
    public MainController(final CounterService counterService) {
        this.counterService = Objects.requireNonNull(counterService, "counterService must not be null.");
    }


    @RequestMapping(value = HOME_PAGE_PATH, method = RequestMethod.GET)
    public CompletableFuture<ModelAndView> index() {
        final ModelAndView mav = new ModelAndView(HOME_PAGE_VIEW);
        return CompletableFuture.completedFuture(mav);
    }

}
