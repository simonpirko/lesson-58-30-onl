package by.tms.lesson5830onl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author simonpirko
 * @version 1.0
 * @since 23.12.2024
 */

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String greeting() {
        return "greeting";
    }
}
