package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p = new Punto(3,4);
		
		Punto pt2 = new Punto (3,4);
		//Da falso porque lo que compara es si tienen la misma direccion de memoria donde se almacenan.
		System.out.println(p == pt2);
		//Este equals, al estar implementado en la clase punto, compara el valor que les hemos puesto en la instancia
		// Si no, el equals funcionaria como un "==".
		System.out.println(p.equals(pt2));
		
		System.out.println(p.hashCode());
		System.out.println(pt2.hashCode());
	}

}
