package com.dev.spring_boot_to_do_web_app.controller;

import com.dev.spring_boot_to_do_web_app.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private final AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String gotoLoginPage() {

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.addAttribute("name", name);

            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials!, Please try again!");

        return "login";
    }
}

//public class LoginController {
//    Logger logger = LoggerFactory.getLogger(getClass());
//
//    @RequestMapping("/login")
//    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//
//        logger.debug("---> Request param is {}", name);
//
//        PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS);
//        String safeName = policy.sanitize(name);
//
//        model.addAttribute("name", safeName);
//
//        return "login";
//    }
//}
