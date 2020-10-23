import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta c1, c2;
		c1 = new Conta("000000000-01", "Marcia 1", 1, 10, 3, 200.00);
		c2 = new Conta("000000000-02", "Marcia 2", 1, 20, 4);
		
		int opcao;
		double valorMov;
		boolean fim;
		fim = false;
		
		do {
			System.out.println("Digite 1- saldo | 2- saque | 3- deposito | 4- sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				c1.Imprimir();
				break;
			case 2:
				System.out.println("Digite o valor para saque: ");
				valorMov = teclado.nextDouble();
				if (c1.ValidarSaldo(valorMov)) {
					c1.Sacar(valorMov);
					c1.Imprimir();
				}
				else {
					System.out.printf("Saldo insuficiente: R$ %.2f\n",c1.getSaldo());
				}
				break;
			case 3:
				System.out.println("Digite o valor para deposito: ");
				valorMov = teclado.nextDouble();
				c1.Depositar(valorMov);
				c1.Imprimir();
				break;
			case 4:
				System.out.println("Obrigado");
				fim = true;
				break;
			}
		}while (!fim);
		
		/*
		
		c1.Imprimir();
		c1.Depositar(50);
		c1.Imprimir();
		
		if (c1.ValidarSaldo(100)){
			c1.Sacar(100);
			c1.Imprimir();
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
		
		//c2.Sacar(100);
		//c2.Imprimir();
		
		*/
		
	}

}
