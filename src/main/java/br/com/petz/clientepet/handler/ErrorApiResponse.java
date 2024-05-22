package br.com.petz.clientepet.handler;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class ErrorApiResponse {
	private String message;
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private String description;
}
