package org.springframework.samples.petclinic.owner;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService implements IOwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public Collection<Owner> findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

	@Override
	public Owner findById(Integer id) {

		return ownerRepository.findById(id);
	}

	@Override
	public void save(Owner owner) {
		ownerRepository.save(owner);

	}

	@Override
	public List<Owner> findOwnerByFirstNameContainsOrLastNameContains(String name) {
		return ownerRepository.findOwnerByFirstNameContainsOrLastNameContains(name);
	}

	@Override
	public Collection<Owner> orderByLastName() {
		return ownerRepository.orderByLastName();
	}

}
