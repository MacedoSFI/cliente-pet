package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz.clientepet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	
	@NotBlank
	private String nomeCompleto;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String celular;
	
	private String telefone;
	private Sexo sexo;
	
	@NotNull
	private LocalDate dataNascimento; //formato: "YYYY-MM-DD"
	
	@CPF
	private String cpf;
	
	@NotNull
	private Boolean aceitaTermos;
	/**
	 * 
	{
	"nomeCompleto":"Felipe Macedo",
	"email":"efgfgdfdf@gmail.com",
	"celular":"22123123123",
	"telefone":"22456456456",
	"sexo":"MASCULINO",
	"dataNascimento":"1984-03-21",
	"cpf":"12312312311",
	"aceitaTermos":"true"
	}
	
	 */
}
