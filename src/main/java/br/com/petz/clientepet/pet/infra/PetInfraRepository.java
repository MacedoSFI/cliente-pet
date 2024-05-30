package br.com.petz.clientepet.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.petz.clientepet.handler.APIException;
import br.com.petz.clientepet.pet.application.service.PetRepository;
import br.com.petz.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
	
	private final PetSpringDataJPARepository petSpringDataJPARepository; 

	@Override
	public Pet salvaPet(Pet pet) {
		log.info("[inicia] PeTInfraRepository - salvaPet");
		petSpringDataJPARepository.save(pet);
		log.info("[finaliza] PeTInfraRepository - salvaPet");
		return pet;
	}

	@Override
	public List<Pet> buscaPetsDoClienteComId(UUID idCliente) {
		log.info("[inicia] PeTInfraRepository - buscaPetDoClienteComId");
		var pets = petSpringDataJPARepository.findByIdClienteTutor(idCliente);
		log.info("[finaliza] PeTInfraRepository - buscaPetDoClienteComId");
		return pets;
	}

	@Override
	public Pet buscaPetPeloId(UUID idPet) {
		log.info("[inicia] PeTInfraRepository - buscaPetPeloId");
		var pet = petSpringDataJPARepository.findById(idPet)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pet não encontrado pelo idPet = " + idPet));
		log.info("[finaliza] PeTInfraRepository - buscaPetPeloId");
		return pet;
	}

}
