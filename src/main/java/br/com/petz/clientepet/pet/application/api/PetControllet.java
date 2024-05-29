package br.com.petz.clientepet.pet.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

//import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PetControllet implements PetAPI{

	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetController -  postPet");
		log.info("[idCliente] {idCliente}", idCliente);
		//PetResponse PetCriado = PetService.criaPet(PetRequest);
		log.info("[finaliza] PetController -  postPet");
		//return clienteCriado;
		return null;
	}

	
}
