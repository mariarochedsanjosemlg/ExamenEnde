
public class CuentaAhorro extends CuentaBancaria{

	private int tasaInteres;
	private double interes;

	public CuentaAhorro(String titular, double saldoInicial,int tasaInteres ) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
	}
	
	public double CalcularInteres(int tasaInteres) {
		double interes = saldo * tasaInteres;
		return interes;
	}

}
