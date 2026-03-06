
public class CuentaCorriente extends CuentaBancaria{

	private int comision;
	private int interes;

	public CuentaCorriente(String titular, double saldoInicial,int comision ) {
		super(titular, saldoInicial);
		this.comision = comision;
	}
	
	public int CalcularInteres(int comision) {
		int interes = comision--;
		return interes;
	}

}
