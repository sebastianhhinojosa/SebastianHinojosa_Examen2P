public class SH_Cuenta_Ahorros extends SH_Cuenta {
    private boolean activa = true;

    public SH_Cuenta_Ahorros(float saldo, float tasa) {
        super(saldo, tasa);
    }

    @Override
    public void depositar(float cantidad) {
        super.depositar(cantidad);
    }

    @Override
    public void retirar(float cantidad) {
        super.retirar(cantidad);
    }

    public static void imprimir(){
        System.out.println("Saldo = " + saldo);
    }
}
