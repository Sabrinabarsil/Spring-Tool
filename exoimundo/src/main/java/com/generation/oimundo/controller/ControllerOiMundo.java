package com.generation.oimundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerOiMundo {
	
	@GetMapping ("/mundo")
	public String oimundo () {
		return "Hello Turma 47 da Generation";
	}
	
	@GetMapping ("/bsmgen")
	public String bsm () {
		return "Orientação ao Futuro, Responsabilidade Pessoas, Mentalidade de Crescimento ,  Persistência, Trabalho em Equipe, Atenção ao Detalhe, Proatividade, Comunicação";
	}
	
	@GetMapping ("/objetivo")
	public String objetivo_da_semana () {
		return "Atenção ao Detalhe, Proatividade, Comunicação";
	}

}
