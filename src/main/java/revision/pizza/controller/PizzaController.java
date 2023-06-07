package revision.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import revision.pizza.model.Pizza;
import revision.pizza.service.PizzaService;

@Controller
public class PizzaController {
    
    @Autowired
    private PizzaService service;

    @GetMapping
    private String getLanding(Model m) {
        m.addAttribute("pizza", new Pizza());
        return "index";        
    }

    

}
