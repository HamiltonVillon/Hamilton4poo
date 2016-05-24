/**
 * Esta clase es el de Jugador
 * @author Hamilton
 *
 */
public class Jugador {

	  public String nombre;
	  public int edad;
	  public int numeroDorsal;
	  public int numeroTarjetasAmarillas = 0;
	  public int numeroTarjetasRojas = 0;
	  public String nacionalidad;
	  public int golesMarcadosCampeonatos = 0;
	  public String posicion;
	  public float sueldoMensual;
	  
	public Jugador(String nombre, int edad, String nacionalidad, float sueldoMensual) {
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.sueldoMensual = sueldoMensual;
	}
	  
	  
	  
}
