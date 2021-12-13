package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.repository.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
	
}