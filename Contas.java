public class Contas {
    int numeroConta;
    String titular;
    String cpf;
    double saldo;
    String tipoConta;
    String dataAbertura;
    boolean ativa;

    public Contas(boolean ativa, String cpf, String dataAbertura, int numeroConta, double saldo, String tipoConta, String titular) {
        this.ativa = ativa;
        this.cpf = cpf;
        this.dataAbertura = dataAbertura;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.titular = titular;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    private void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void encerrarConta() {
        if (this.saldo != 0) {
            System.out.println("A CONTA AINDA CONTÉM DINHEIRO PARA SER ENCERRADA! Saque o saldo restante para encerrar a conta.");
            return;
        }
        if (!this.ativa) {
            System.out.println("A CONTA JÁ ESTÁ ENCERRADA!");
            return;
        }
        setAtiva(false);
        System.out.println("CONTA ENCERRADA COM SUCESSO!");
    }

    public boolean depositar(double valor) {
        if (!ativa) {
            System.out.println("Depósito falhou: conta inativa.");
            return false;
        }
        if (valor <= 0) {
            System.out.println("Depósito falhou: valor inválido.");
            return false;
        }
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
        return true;
    }

    public boolean sacar(double valor) {
        if (!ativa) {
            System.out.println("Saque falhou: conta inativa.");
            return false;
        }
        if (valor <= 0) {
            System.out.println("Saque falhou: valor inválido.");
            return false;
        }
        if (this.saldo < valor) {
            System.out.println("Saque falhou: saldo insuficiente. Saldo atual: " + this.saldo);
            return false;
        }
        this.saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "ativa=" + ativa +
                ", numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                ", tipoConta='" + tipoConta + '\'' +
                ", dataAbertura='" + dataAbertura + '\'' +
                '}';
    }
}
