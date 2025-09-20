public class ListaEncadeada {
    No cabeca;
    int contagem = 0;

    public void addValor(Contas conta){
        No novoValor = new No(conta);

        if (contagem == 0){
            this.cabeca = novoValor;
        } else {
            No atual = cabeca;

            while (true){
                if (atual.conta.getNumeroConta() == conta.getNumeroConta()){
                    System.out.println("A CONTA JÁ CONSTA NA LISTA!");
                    return;
                }
                if (atual.proximo == null){
                    break;
                }
                atual = atual.proximo;
            }
            atual.proximo = novoValor;
        }
        contagem++;
    }

    public void remover(int valor) {
        if (cabeca == null) return;

        if (cabeca.conta.getNumeroConta() == valor) {
            cabeca = cabeca.proximo;
            contagem--;
            System.out.println("Conta removida com sucesso!");
            return;
        }

        No anterior = cabeca;
        No atual = cabeca.proximo;

        while (atual != null) {
            if (atual.conta.getNumeroConta() == valor) {
                anterior.proximo = atual.proximo;
                contagem--;
                System.out.println("Conta removida com sucesso!");
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }

        System.out.println("A CONTA INFORMADA NÃO ESTÁ NA LISTA!");
        return;
    }

    public void buscarConta(int valor){
        No atual = cabeca;

        while (atual != null){

            if (atual.conta.getNumeroConta() == valor){
                System.out.println(atual.conta.toString());
                return;
            }
            atual = atual.proximo;
        }

        System.out.println("CONTA NÃO ENCONTRADA");
    }


    public void imprimirContasDaLista(){
        No atual = cabeca;

        if (cabeca == null){
            System.out.println("NENHUMA CONTA FOI ADICIONADA!");
            return;
        }
        
        while (atual != null){
            System.out.println(atual.conta.toString());
            atual = atual.proximo;
        }
    }
}
