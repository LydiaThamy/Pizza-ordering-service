package revision.pizza.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PizzaRepo {
    
    @Autowired
    @Qualifier("pizza")
    private RedisTemplate<String, Object> template;

}
