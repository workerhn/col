package com;

public class Tiempo2
{
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo2()
	{
		this(0, 0, 0);
	}
	
	public Tiempo2( int h )
	{
		this(h, 0, 0);
	}
	
	public Tiempo2( int h, int m )
	{
		this(h, m, 0);
	}
	
	public Tiempo2( int h, int m, int s )
	{
		establecerTiempo(h, m, s);
	}
	
	public Tiempo2( Tiempo2 tiempo )
	{
		// invoca al constructor de Tiempo2 con tres argumentos
		this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
	}
	
	// Metodos "establecer"
	// establece un nuevo valor de tiempo usando la hora universal; asegura que
	// los datos sean consistentes, estableciendo los valores invalidos en cero
	public void establecerTiempo( int h, int m, int s )
	{
		establecerHora(h);
		establecerMinuto(m);
		establecerSegundo(s);
	}
	
	public void establecerHora( int h )
	{
		hora = ((h >= 0 && h < 24) ? h : 0);
	}
	
	public void establecerMinuto( int m )
	{
		minuto = ((m >= 0 && m < 60) ? m : 0);
	}
	
	public void establecerSegundo( int s )
	{
		segundo = ((s >= 0 && s < 60) ? s : 0);
	}
	
	public int obtenerHora()
	{
		return hora;
	}
	
	public int obtenerMinuto()
	{
		return minuto;
	}
	
	public int obtenerSegundo()
	{
		return segundo;
	}
	
	public String aStringUniversal()
	{
		return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
	}
	
	// convierte a objeto String en formato de hora estándar (H:MM:SS AM o PM)
	@Override
	public String toString()
	{
		return String.format("%d:%02d:%02d  %s",
				((obtenerHora() == 0 || obtenerHora() <= 12) ? 12 : obtenerHora() % 12),
				obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
	}
	
}