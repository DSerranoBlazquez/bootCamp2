package org.springframework.samples.petclinic.owner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService implements IPetService {

	@Autowired
	private PetRepository petRepository;

	@Override
	public List<PetType> findPetTypes() {
		// TODO Auto-generated method stub
		return petRepository.findPetTypes();
	}

	@Override
	public Pet findById(Integer id) {
		// TODO Auto-generated method stub
		return petRepository.findById(id);
	}

	@Override
	public void save(Pet pet) {
		petRepository.save(pet);
	}

}
