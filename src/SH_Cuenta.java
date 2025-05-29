public class SH_Cuenta {
    static float saldo;
    static float tasa;
    static int depositos=0;
    static int retiros=0;

    public SH_Cuenta(float sado, float tasa) {
    }

    public void depositar(float cantidad){
        saldo += cantidad;
        depositos += 1;
        System.out.println("Depositaste: $" + cantidad);
        System.out.println("Numero de depositos: " + depositos);
    }
    public void retirar(float cantidad){
        saldo -= cantidad;
        retiros += 1;
        System.out.println("Retiraste: $" + cantidad);
        System.out.println("Numero de retiros: " + retiros);
    }
}
