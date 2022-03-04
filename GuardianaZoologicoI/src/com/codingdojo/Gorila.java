package com.codingdojo;

public class Gorila extends Mamifero {

	public Gorila(int nivelDeEnergia) {
		super(nivelDeEnergia);
		// TODO Auto-generated constructor stub
	}
	
	public void lanzarAlgo() {
		System.out.println("el gorila lanzó algo");
		setNivelDeEnergia(getNivelDeEnergia() - 5);
	}
	
	public void comerBananas() {
		System.out.println("me encanta comer ");
		setNivelDeEnergia(getNivelDeEnergia() + 10);
	}
	
	public void escalar() {
		System.out.println("ha trepado un arbol ");
		setNivelDeEnergia(getNivelDeEnergia() - 10);
	}
}
