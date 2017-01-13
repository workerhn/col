package com;

public class PruebaThis
{
	public static void main(String[] args)
	{
		TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
		System.out.println(tiempo.crearString());
	}
}

// la clase TiempoSimple demuestra la referencia "this"
class TiempoSimple
{
	private int hora;
	private int minuto;
	private int segundo;
	
	public TiempoSimple(int hora, int minuto, int segundo)
	{
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	// usa la referencia "this" explicita e implicita para llamar
	// aStringUniversal
	public String crearString()
	{
		return String.format("%24s: %s\n%24s: %s",
				"this.aStringUniveral()", this.aStringUniveral(),
				"aStringUniversal()", aStringUniveral());
	}
	
	// convierte a objeto String en formato de hora estándar (H:MM:SS AM o PM)
	public String aStringUniveral()
	{
		// "this" no se requiere aqui para acceder a las variables de instancia,
		// ya que el metodo no tiene variables locales con los mismos
		// nombres que las variables de instancia
		return String.format("%d:%02d:%02d", this.hora, this.minuto, this.segundo);
	}
	
}