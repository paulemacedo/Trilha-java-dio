package contabanco;
import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome!");
		String NomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o número da Agência!");
		String Agencia = sc.nextLine();
		
		System.out.println("Por favor, digite o número da conta!");
		int numero = sc.nextInt();
		
		System.out.println("Por favor, digite o Saldo!");
		double Saldo = sc.nextDouble();
		
		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta "+ numero +" e seu saldo R$ " + Saldo + " já está disponível para saque.");
		
		sc.close();
		

	}

}
