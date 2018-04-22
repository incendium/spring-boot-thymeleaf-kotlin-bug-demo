package com.iamincendium.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JavaController {
    @RequestMapping("/java")
    public ModelAndView java() {
        TestModel model = new TestModel(1, "java");

        return new ModelAndView("java")
                .addObject("model", model);
    }
}
