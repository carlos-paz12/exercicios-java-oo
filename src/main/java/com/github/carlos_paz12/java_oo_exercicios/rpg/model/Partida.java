package com.github.carlos_paz12.java_oo_exercicios.rpg.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partida {

	private List<Personagem> personagens;
	private int turnos, vez;

	public Partida(Personagem... p) {
		personagens = new ArrayList<>(Arrays.asList(p));
		turnos = 0;
		vez = (int) (Math.random() * personagens.size());
	}

	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public int getTurnos() {
		return turnos;
	}

	public int getVez() {
		return vez;
	}

	public Personagem getPersonagemDaVez() {
		return personagens.get(vez);
	}

	public Personagem getPersonagemPorNome(String nome) {
		for (Personagem p : personagens) {
			if (p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;
	}

	public void avancarTurno() {
		
		turnos++;
		
		Personagem morto = null;
		
		for (Personagem p : personagens) {
			if (p.isMorto()) {
				morto = p;
				break;
			}
		}
		
		personagens.remove(morto);
		vez++;
		
		if (vez >= personagens.size()) {
			vez = 0;
		}
	}

}
