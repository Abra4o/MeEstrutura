public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Criando algumas contas
        Contas conta1 = new Contas(true, "111.111.111-11", "01/01/2020", 1001, 500.0, "Corrente", "João");
        Contas conta2 = new Contas(true, "222.222.222-22", "15/03/2021", 1002, 1200.0, "Poupança", "Maria");
        Contas conta3 = new Contas(true, "333.333.333-33", "20/05/2022", 1003, 750.0, "Corrente", "Pedro");

        // Adicionando contas na lista
        System.out.println("Adicionando contas:");
        lista.addValor(conta1);
        lista.addValor(conta2);
        lista.addValor(conta3);

        // Tentando adicionar uma conta duplicada
        System.out.println("\nTentando adicionar uma conta duplicada (1002):");
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

        // Imprimindo novamente todas as contas
        System.out.println("\nTodas as contas na lista após remoções:");
        lista.imprimirContasDaLista();
    }
}
