package com;

public class PruebaTiempo1
{
	public static void main(String[] args)
	{
		Tiempo1 tiempo = new Tiempo1();
		
		// imprime representaciones de cadena del tiempo
		System.out.print("La hora universal inicial es ");
		System.out.println(tiempo.aStringUniversal());
		System.out.print("La hora estandar inicial es ");
		System.out.println(tiempo.toString());
		System.out.println();
		
		// modifica el tiempo e imprime el tiempo acutalizado
		tiempo.establecerTiempo(13, 27, 6);
		System.out.print("La hora universal despues de establecerTiempo es: ");
		System.out.println(tiempo.aStringUniversal());
		System.out.print("La hora estandar despues de establecerTiempo es ");
		System.out.println(tiempo.toString());
		System.out.println();
		
		// establecer el tiempo con valores invalidos; imprime el tiempo
		// actualizado
		tiempo.establecerTiempo(99, 99, 99);
		System.out.println("Despues de intentar ajustes invalidos ");
		System.out.print("Hora universal: ");
		System.out.println(tiempo.aStringUniversal());
		System.out.print("Hora estandar: ");
		System.out.println(tiempo.toString());
	}
	
}
