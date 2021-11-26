package q3;

public class ContaSimples extends ContaBancaria {
	
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca >= 0)
			this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			setSaldoPoupanca(getSaldoPoupanca() + valor);
			return true;
		}
		return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if ((valor > 0) && (valor <= getSaldoPoupanca())) {
			setSaldoPoupanca(getSaldoPoupanca() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
