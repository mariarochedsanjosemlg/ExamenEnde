/*
 * Clase Cuenta Ahorro, hija de clase Cuenta Bancaria
 * @Author María Roche Durán
 * @version 1.00
 */
public class CuentaAhorro extends CuentaBancaria{
/*
 * Variable tasa de interés propia de la clase
 */
	private double tasaInteres;
	/*
	 * Variable de interés que hará falta más adelante
	 */
	private double interes;

	/*
	 * Clase cuenta Ahorro
	 * @param String titular
	 * @param double SaldoInicial
	 * @param double tasaInteres
	 */
	public CuentaAhorro(String titular, double saldoInicial,double tasaInteres ) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
	}
	
	/*
	 * Método para calcular interes.
	 * @param tasa Interes
	 * @return interes
	 */
	public double CalcularInteres(double tasaInteres) {
		double interes = saldo * tasaInteres;
		return interes;
	}

}
