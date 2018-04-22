package com.iamincendium.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class KotlinController {
    @RequestMapping("/kotlin")
    fun kotlin(): ModelAndView {
        val model = TestModel(1, "kotlin")

        return ModelAndView("kotlin")
                .addObject("model", model)
    }
}
