
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Anderson");
		cliente.setCpf("398.505.228-01");
		cliente.setProfissao("QA");
		
		Conta contaCliente = new Conta(100, 1500);
		contaCliente.deposita(100);
		
		contaCliente.setTitular(cliente);
		System.out.println(contaCliente.getTitular().getNome());
		System.out.println(contaCliente.getTitular());
	}

}
