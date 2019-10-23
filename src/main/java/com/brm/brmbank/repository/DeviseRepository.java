package com.brm.brmbank.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Devise;


@Repository
public interface DeviseRepository extends CrudRepository<Devise, Long>  {
	
	

}
