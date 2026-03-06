/*
 * Clase Cuenta corriente, hija de Cuenta Bancaria, cuenta con sus propios atributos comision e interes
 * @author María Roche Durán
 * @version 1.0.0
 */
public class CuentaCorriente extends CuentaBancaria{

	/*
	 * Variable int comisión.
	 */
	private int comision;
	/*
	 * Variable int interes.
	 */
	private int interes;

	/*
	 * Clase cuenta corriente.
	 * @param String titular.
	 * @param double saldo Inicial.
	 * @param int comision.
	 */
	public CuentaCorriente(String titular, double saldoInicial,int comision ) {
		super(titular, saldoInicial);
		this.comision = comision;
	}
	
	/*
	 * Método para calcular interes.
	 * @param tasa Interes
	 * @return interes
	 */
	public int CalcularInteres(int comision) {
		int interes = -comision;
		return interes;
	}

}
