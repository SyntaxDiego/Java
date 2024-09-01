package Week01;

public class CuentaBancaria {
    private String titular;
    private float saldo;

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Diego Carranza", 50000);
    }

    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void despositar_dinero(float saldo){
        saldo = saldo + getSaldo();
    }
    public void retirar_dinero(float saldo){
        saldo = saldo - getSaldo();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}