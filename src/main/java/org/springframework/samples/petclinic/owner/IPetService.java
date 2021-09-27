package org.springframework.samples.petclinic.owner;

import java.util.List;

public interface IPetService {

	List<PetType> findPetTypes();

	Pet findById(Integer id);

	void save(Pet pet);

}
