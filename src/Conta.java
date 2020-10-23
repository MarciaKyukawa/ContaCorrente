
public class Conta {
	private String CPFtitular;
	private String NomeTitular;
	private int agencia;
	private int conta;
	private int dv;
	private double saldo;
	
	public String getCPFtitular() {
		return CPFtitular;
	}

	public void setCPFtitular(String cPFtitular) {
		CPFtitular = cPFtitular;
	}

	public String getNomeTitular() {
		return NomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		NomeTitular = nomeTitular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getDv() {
		return dv;
	}

	public void setDv(int dv) {
		this.dv = dv;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(String CPFtitular, String NomeTitular, int agencia, int conta, int dv, double saldo) {
		this.CPFtitular = CPFtitular;
		this.NomeTitular = NomeTitular;
		this.agencia = agencia;
		this.conta = conta;
		this.dv = dv;
		this.saldo = saldo;
	}
	
	public Conta(String CPFtitular, String NomeTitular, int agencia, int conta, int dv) {
		this.CPFtitular = CPFtitular;
		this.NomeTitular = NomeTitular;
		this.agencia = agencia;
		this.conta = conta;
		this.dv = dv;
	}
	
	
	public double Depositar(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public double Sacar(double valor) {
		saldo = saldo - valor;
		return saldo;
	}
	
	public boolean ValidarSaldo(double valor) {
		boolean saldoOK;
		if (saldo < valor){
			saldoOK = false;
		}
		else {
			saldoOK = true;
		}
		return saldoOK;
		}
	
	public void Imprimir() {
		System.out.println("--------------------------");
		System.out.println("Conta        = "+agencia+"-"+conta+"/"+dv);
		System.out.println("Titular      = "+NomeTitular);
		System.out.println("CPF          = "+CPFtitular);
		System.out.printf("Saldo         = R$ %.2f\n", saldo);
	}
	
	}

