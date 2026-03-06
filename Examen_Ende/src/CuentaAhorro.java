
public class CuentaAhorro extends CuentaBancaria{

	private double tasaInteres;
	private double interes;

	public CuentaAhorro(String titular, double saldoInicial,double tasaInteres ) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
	}
	
	public double CalcularInteres(double tasaInteres) {
		double interes = saldo * tasaInteres;
		return interes;
	}

}
