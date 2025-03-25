public class Conta {

    private String titular;
    private String agencia;
    private String dataAbertura;
    private int numero;
    private double saldo;

    public Conta(String titular, String agencia, String dataAbertura, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }
    public String getAgencia() {
        return this.agencia;
    }
    public String getDataAbertura() {
        return this.dataAbertura;
    }
    public int getNumero() {
        return this.numero;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public double saca(double valorSacado) {
        if (valorSacado > 0 && valorSacado < saldo) {
            saldo -= valorSacado;
        }
        return saldo;
    }

    public double deposita(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        }
        return saldo;
    }
    public double calculaRendimento(){
        return saldo * 0.1;
    }
}