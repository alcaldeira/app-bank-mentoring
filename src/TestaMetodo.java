public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta(6646,1423);
		conta1.deposita(100);
		conta1.deposita(50);
		System.out.println(conta1.getSaldo());

		boolean conseguiuRetirar = conta1.saca(20);
		System.out.println(conta1.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta conta2 = new Conta(6644,342);
		conta2.deposita(1000);

		boolean sucessoTransferencia = conta2.transfere(300, conta1);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(conta2.getSaldo());
		System.out.println(conta1.getSaldo());
	}

}