package br.com.petz.clientepet.pet.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.pet.application.service.PetService;
//import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI{
	
	private final PetService petService;
	
	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetController -  postPet");
		log.info("[idCliente] {}", idCliente);
		PetResponse petCriado = petService.criaPet(idCliente, petRequest);
		log.info("[finaliza] PetController -  postPet");
		return petCriado;
	}

	@Override
	public List<PetClienteListResponse> getPetsDoClienteComId(UUID idCliente) {
		log.info("[inicia] PetController -  getPetsDoClienteComId");
		List<PetClienteListResponse> PetsDoCliente = petService.buscaPetsDoClienteComId(idCliente);
		log.info("[finaliza] PetController -  getPetsDoClienteComId");
		return PetsDoCliente;
	}

	@Override
	public PetClienteDetalhadoResponse getPetDoClienteComId(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController -  getPetDoClienteComId");
		log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
		PetClienteDetalhadoResponse pet = petService.buscaPetDoClienteComId(idCliente, idPet);
		log.info("[finaliza] PetController -  getPetDoClienteComId");
		return pet;
	}
	
	@Override
	public void deletaPetDoClientecomId(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController -  deletaPetDoClientecomId");
		log.info("[idCliente] {} - [idPet] {} ", idCliente, idPet);
		petService.deletaPetDoClienteComId(idCliente, idPet);
		log.info("[finaliza] PetController -  DeletaPetDoClienteComId");
		
	}

	
}
