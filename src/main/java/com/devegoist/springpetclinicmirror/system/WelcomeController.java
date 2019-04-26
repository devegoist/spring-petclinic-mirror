package com.devegoist.springpetclinicmirror.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kim, eun soo - devegoist
 * @date 19/04/2019
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }
}
