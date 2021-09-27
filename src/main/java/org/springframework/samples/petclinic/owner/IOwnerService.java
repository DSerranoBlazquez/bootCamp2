package org.springframework.samples.petclinic.owner;

import java.util.Collection;
import java.util.List;

public interface IOwnerService {

	Collection<Owner> findByLastName(String lastName);

	Owner findById(Integer id);

	void save(Owner owner);

	List<Owner> findOwnerByFirstNameContainsOrLastNameContains(String name);

	Collection<Owner> orderByLastName();

}
