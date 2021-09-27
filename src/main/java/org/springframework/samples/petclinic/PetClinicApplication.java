/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.vet.Speciality;
import org.springframework.samples.petclinic.vet.SpecialityRepository;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication(proxyBeanMethods = false)
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);

	}

	@Bean
	public CommandLineRunner pruebas(VetRepository vetRepository, SpecialityRepository specialityRepository) {
		return (args) -> {
			System.out.println("BOOTCAMP - Spring y Spring Data - vetRepository");

			Vet vet = crearVetSinSpecialty();

			System.out.println("Persistimos en BBDD");
			vet = vetRepository.save(vet);

			System.out.print("Comprobamos que se ha creado correctamente\n");
			Vet vetAux = vetRepository.findById(vet.getId());
			System.out.print(vetAux.toString());

			Speciality s = specialityRepository.findById(1);
			vet.addSpecialty(s);
			vet = vetRepository.save(vet);
			System.out.print("\n" + vet.toString());

			//Collection<Vet> vets = vetRepository.findAll();
			/*
			 * System.out.print("\nListamos todos los veterinarios \n"); for(Vet v:
			 * vetRepository.findAll()){ System.out.println("Vet: "+v +"\n"); }
			 */
		};
	}

	private Vet crearVetSinSpecialty() {
		System.out.print("Creamos un objeto Vet");
		Vet vet = new Vet();
		vet.setFirstName("David");
		vet.setLastName("Serrano Blazquez");
		return vet;
	}

}
