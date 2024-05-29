package br.com.petz.clientepet.pet.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idPet;
	@NotBlank
	private String nomePet;
	@Enumerated(EnumType.STRING)
	private SexoPet sexo;
	@NotNull
	private LocalDate dataNascimento;
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@Enumerated(EnumType.STRING)
	private TipoPet tipo;
	private String microchip;
	private String raca;
	private String pelagemCor;
	private String rga;
	private Integer peso;
	private LocalDateTime dataHoraCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	/*
	 * public Pet(ClienteRequest clienteRequest) { this.nomeCompleto =
	 * clienteRequest.getNomeCompleto(); this.email = clienteRequest.getEmail();
	 * this.celular = clienteRequest.getCelular(); this.telefone =
	 * clienteRequest.getTelefone(); this.sexo = clienteRequest.getSexo();
	 * this.dataNascimento = clienteRequest.getDataNascimento(); this.cpf =
	 * clienteRequest.getCpf(); this.aceitaTermos =
	 * clienteRequest.getAceitaTermos(); this.dataHoraCadastro =
	 * LocalDateTime.now(); }
	 * 
	 * public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
	 * this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto(); this.celular =
	 * clienteAlteracaoRequest.getCelular(); this.telefone =
	 * clienteAlteracaoRequest.getTelefone(); this.sexo =
	 * clienteAlteracaoRequest.getSexo(); this.dataNascimento =
	 * clienteAlteracaoRequest.getDataNascimento(); this.aceitaTermos =
	 * clienteAlteracaoRequest.getAceitaTermos(); this.dataHoraDaUltimaAlteracao =
	 * LocalDateTime.now();
	 * 
	 * }
	 */
}
