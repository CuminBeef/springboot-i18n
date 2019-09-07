package com.adonis.app.springbooti18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@Autowired
    private MessageSource messageSource;

    @RequestMapping("/welcome")
    public String hello(Model model){
        Locale locale = LocaleContextHolder.getLocale();
        model.addAttribute("welcome", messageSource.getMessage("welcome", null, locale));
        return "index";
    }

}
