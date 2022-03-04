package com.codingdojo;
import java.util.ArrayList;
import java.util.Arrays;

public class TestGorila {
		public static void main( String args[]) {
			Gorila gorila = new Gorila(100);	
			
			gorila.lanzarAlgo();
			gorila.lanzarAlgo();
			gorila.lanzarAlgo();
			gorila.comerBananas();
			gorila.comerBananas();
			gorila.escalar();
			
			
			System.out.println(gorila.mostrarEnergia());
		}
}
