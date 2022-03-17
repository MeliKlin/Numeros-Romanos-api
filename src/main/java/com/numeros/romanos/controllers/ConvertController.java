package com.numeros.romanos.controllers;

import com.numeros.romanos.business.ConvertNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvertController {

    @GetMapping("/convert/{num}")
    @ResponseBody
    public String convertNumbers(@PathVariable Integer num) {
        return new ConvertNumber().execute(num);
    }

}
