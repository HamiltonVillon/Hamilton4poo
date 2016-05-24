/**
 *Esta clase contiene nformacion basica del equipo 
 * @author Hamilton
 *
 */
public class Equipo {
	//Varibles
	public String nombre;
	public int cantidadJugadores;
	public int anioFundacion;
	public String directorTecnico;
	public int camopeonatosGanados = 0;
	public char categoria;
	public String ciudadLocalia;
	public String estadio;
	public int cantidadSocio;
	public String presidente;
	public float presupuesto = 0;
	public String[] sponsors;
	public Jugador[] jugadores;
	
	Equipo(String nombre, int anioFundacion, String dt, int campeonatosGanados, char categoria,
			String ciudad, String estadio, int cantidadSocio, String presidente, float presupesto)
	{
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
	    this.directorTecnico = dt;
	    this.camopeonatosGanados = campeonatosGanados;
	    this.categoria = categoria;
	    this.estadio =estadio;
	    this.cantidadSocio = cantidadSocio;
	    this.presidente = presidente;
	    this.presupuesto =  presupesto;
	    jugadores  = new Jugador [11];
	    	    
	}
	
	public void cambiarCategoria (char nuevaCategoria)
	{
		this.categoria = nuevaCategoria;
	}
	
	public void campeonar ()
	{
		camopeonatosGanados++;
	}
	
	public void cambiarDT (String nuevoDT)
	{
		this.directorTecnico = nuevoDT;
	}
	
	public void contratarJugadores ( Jugador nuevoJugador)
	{
		int indice =  jugadores.length;
		this.jugadores[0] = nuevoJugador;
	}
}
