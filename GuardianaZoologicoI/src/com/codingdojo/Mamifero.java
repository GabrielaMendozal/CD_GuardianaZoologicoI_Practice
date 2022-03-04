package com.codingdojo;

public class Mamifero {
	private int nivelDeEnergia=100;

	public Mamifero(int nivelDeEnergia) {
		super();
		this.nivelDeEnergia = nivelDeEnergia;
	}

	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	public int mostrarEnergia(){
		System.out.println("Nivel de Energ�a: " + nivelDeEnergia);
		return nivelDeEnergia;
	}
}
