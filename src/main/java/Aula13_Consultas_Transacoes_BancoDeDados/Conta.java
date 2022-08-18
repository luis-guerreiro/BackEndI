package Aula13_Consultas_Transacoes_BancoDeDados;

public class Conta {

    private int id;
    private String nome;
    private String numConta;
    private double saldo;

    public Conta(int id, String nome, String numConta, double saldo) {
        this.id = id;
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double aumentarSaldo(double valor){
        this.saldo += valor;
        return this.saldo;
    }
}
