package Week01;

public class CuentaBancaria {
    private String titular;
    private float saldo;

    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
    }

    public float depositar_dinero(float cantidad) {
        saldo = saldo + cantidad;
        return saldo;
    }

    public float retirar_dinero(float cantidad) {
        saldo = saldo - cantidad;
        return saldo;
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

class CuentaCorriente extends CuentaBancaria {
    private float limite_descubierto;

    public static void main(String[] args){
        CuentaCorriente cuenta01 = new CuentaCorriente("Diego Carranza", 90000);
        System.out.println(cuenta01.depositar_dinero(30000));
        
    }

    public CuentaCorriente(String titular, float saldo) {
        super(titular, saldo);
        this.limite_descubierto = saldo/2;
    }
}