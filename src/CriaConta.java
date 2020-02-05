
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(6646, 1012350);
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(6645, 966050540);
		segundaConta.deposita(100);
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
	}
}
