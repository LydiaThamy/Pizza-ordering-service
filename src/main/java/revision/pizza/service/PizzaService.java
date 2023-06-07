package revision.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import revision.pizza.repository.PizzaRepo;

@Service
public class PizzaService {
    
    @Autowired
    private PizzaRepo repo;

    public boolean validatePizza(String pizza) {
        String[] PIZZA_VALUES = {"bella", "margherita", "marinara", "spianatacalabrese", "trioformaggio"};
        
        for (String value : PIZZA_VALUES) {
            if (pizza.equals(value))
            return true;
        }

        return false;
    }
    
}
