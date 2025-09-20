public class Main {
    public static void main(String[] args) {
        // Criando a lista encadeada
        ListaEncadeada lista = new ListaEncadeada();

        // Criando contas
        Contas conta1 = new Contas(true, "111.111.111-11", "01/01/2020", 1001, 500.0, "Corrente", "João");
        Contas conta2 = new Contas(true, "222.222.222-22", "15/03/2021", 1002, 0.0, "Poupança", "Maria");
        Contas conta3 = new Contas(true, "333.333.333-33", "20/05/2022", 1003, 750.0, "Corrente", "Pedro");

        // Adicionando contas
        System.out.println("Adicionando contas:");
        lista.addValor(conta1);
        lista.addValor(conta2);
        lista.addValor(conta3);

        // Tentando adicionar conta duplicada
        System.out.println("\nTentando adicionar conta duplicada (1002):");
        Contas contaDuplicada = new Contas(true, "444.444.444-44", "10/08/2023", 1002, 900.0, "Poupança", "Lucas");
        lista.addValor(contaDuplicada);

        // Imprimindo todas as contas
        System.out.println("\nTodas as contas na lista:");
        lista.imprimirContasDaLista();

        // Buscando uma conta específica
        System.out.println("\nBuscando conta 1002:");
        lista.buscarConta(1002);

        System.out.println("\nBuscando conta 9999 (inexistente):");
        lista.buscarConta(9999);

        // Removendo uma conta
        System.out.println("\nRemovendo conta 1001:");
        lista.remover(1001);

        System.out.println("\nRemovendo conta 9999 (inexistente):");
        lista.remover(9999);

        // Operações financeiras
        System.out.println("\nDepositando 200 na conta 1003:");
        conta3.depositar(200);

        System.out.println("\nSacando 500 da conta 1003:");
        conta3.sacar(500);

        System.out.println("\nTentando sacar 1000 da conta 1003 (saldo insuficiente):");
        conta3.sacar(1000);

        // Encerrando contas
        System.out.println("\nTentando encerrar conta 1002 (saldo = 0):");
        conta2.encerrarConta();

        System.out.println("\nTentando encerrar conta 1003 (saldo > 0):");
        conta3.encerrarConta();

        // Imprimindo lista final
        System.out.println("\nLista final de contas:");
        lista.imprimirContasDaLista();
    }
}
