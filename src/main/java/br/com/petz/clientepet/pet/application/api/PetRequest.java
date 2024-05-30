package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PetRequest {
	
	@NotBlank
	private String nomePet;
	
	@NotNull
	@Enumerated(EnumType.STRING)//por enquanto ta sem notnull e enumerated
	private Porte porte;
	
	@NotNull
	private TipoPet tipo;
	
	private String microchip;
	
	@NotBlank
	private String raca;
	
	@NotNull	
	@Enumerated(EnumType.STRING)
	private SexoPet sexo;//só notnull
	
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	
	private String rga;
	
	private Integer peso;
}
