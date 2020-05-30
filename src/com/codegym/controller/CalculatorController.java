package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculatorController {
    public static final String ADDITION = "add";
    public static final String SUBTRACTION = "sub";
    public static final String MULTIPLICATION = "mul";
    public static final String DIVISION = "div";

    @GetMapping(value = "/calculator")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping(value = "/result")
    public String showResult(Model model, @RequestParam("numberOne") String numberOne,
                             @RequestParam("numberTwo") String numberTwo,
                             @RequestParam(value = ADDITION, required = false) String add,
                             @RequestParam(value = SUBTRACTION, required = false) String sub,
                             @RequestParam(value = MULTIPLICATION, required = false) String mul,
                             @RequestParam(value = DIVISION, required = false) String div) {
        int numberone = Integer.parseInt(numberOne);
        int numbertwo = Integer.parseInt(numberTwo);

        model.addAttribute("numberOne", numberOne);
        model.addAttribute("numberTwo", numberTwo);
        int result;

        if (add != null) {
            result = numberone + numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("app", "Addition");
        } else if (sub != null) {
            result = numberone - numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("app", "Subtraction");
        } else if (mul != null) {
            result = numberone * numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("app", "Multiplication");
        } else if (div != null) {
            if (numbertwo == 0) {
                return "error";
            } else {
                result = numberone / numbertwo;
                model.addAttribute("result", result);
                model.addAttribute("app", "Division");
            }
        }
        return "result";
    }
}
