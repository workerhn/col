package com;

public class Tiempo1
{
	private int hora;
	private int minuto;
	private int segundo;
	
	public void establecerTiempo(int h, int m, int s)
	{
		hora = ((h >= 0 && h < 24) ? h : 0);
		minuto = ((m >= 0 && m < 60) ? m : 0);
		segundo = ((s >= 0 && s < 60) ? s : 0);
	}
	
	// convierte a objeto String en formato de hora universal (HH:MM:SS)
	public String aStringUniversal()
	{
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	
	// convierte a objeto String en formato de hora estándar (H:MM:SS AM o PM)
	@Override
	public String toString()
	{
		return String.format("%d:%02d:%02d  %s", ((hora == 0 || hora <= 12) ? 12 : hora % 12),
				minuto, segundo, (hora < 12 ? "AM" : "PM"));
	}
	
}
