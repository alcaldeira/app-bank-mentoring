public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta cliente= new Conta(6646,969060);
		System.out.println(cliente.getSaldo());

		cliente.setTitular(new Cliente());
		System.out.println(cliente.getTitular());

		cliente.getTitular().setNome("Marcela");
		System.out.println(cliente.getTitular().getNome());

	}
}