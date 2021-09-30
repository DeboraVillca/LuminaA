 
public class Cliente {
	int NroCliente;
	String Domicilio;
	String CondicionImpositiva;
	String TipoDocumento;
	public Cliente(int nroCliente, String domicilio, String condicionImpositiva, String tipoDocumento, int dni) {
		super();
		NroCliente = nroCliente;
		Domicilio = domicilio;
		CondicionImpositiva = condicionImpositiva;
		TipoDocumento = tipoDocumento;
		this.dni = dni;
	}
	public int getNroCliente() {
		return NroCliente;
	}
	public void setNroCliente(int nroCliente) {
		NroCliente = nroCliente;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getCondicionImpositiva() {
		return CondicionImpositiva;
	}
	public void setCondicionImpositiva(String condicionImpositiva) {
		CondicionImpositiva = condicionImpositiva;
	}
	public String getTipoDocumento() {
		return TipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	int dni;
	

}
