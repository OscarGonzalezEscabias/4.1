/**
 * Esta clase la utilizo para aprender a documentar con javadoc 
 */ 

package ies;
/**
 * @author Óscar
 * @version 0.0.1
 * @since 2023-04-14
 * @serial 10100110011
 */ 

 /**
  * @see <a href = "http://www.aprenderaprogramar.com" /> aprenderaprogramar.com – Didáctica en programación </a>
  * @see #getPobla()
  */
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;

	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
	}

	/**
	 * @param emp_no
	 * @param nombre
	 * @param salario
	 * @return {@link #getPobla()}
	 * @throws No hay excepciones
	 * @deprecated No hay clases que se vayan a borrar
	 */
	
	public Empleado(int emp_no, String nombre, Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}

	
}