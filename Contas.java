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

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    //depositar
    public boolean depositar(double valor) {
        if (!ativa || valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    // sacar
    public boolean sacar(double valor) {
        if (!ativa || valor <= 0 || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
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
