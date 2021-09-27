package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.vet.SpecialityRepository;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.samples.petclinic.visit.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class PetClinicService implements IPetClinicService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	private PetRepository OwnerRepository;

	@Autowired
	private VetRepository vetRepository;

	@Autowired
	private VisitRepository visitRepository;

}
