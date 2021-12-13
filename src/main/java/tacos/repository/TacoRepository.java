package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.repository.entity.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
	
}