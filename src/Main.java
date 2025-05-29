public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Acaba de crear una cuenta de Ahorros");
        System.out.println("Ingrese Saldo inicial:");
        float saldoInicial = scanner.nextInt();

        System.out.println("Ingrese tasa de interes anual:");
        float tasaAnual = scanner.nextInt();

        SH_Cuenta_Ahorros Cuenta1 = new SH_Cuenta_Ahorros(saldoInicial,tasaAnual);

        System.out.println("Selecione una opcion:");
        System.out.println("1.\tDepositar");
        System.out.println("2.\tRetirar");
        System.out.println("3.\tVer Saldo");
        System.out.println("4.\tSalir");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el monto a depositar");
                float deposito = scanner.nextInt();
                Cuenta1.depositar(deposito);
            case 2:
                System.out.println("Ingrese el monto a retirar");
                float retiro = scanner.nextInt();
                Cuenta1.retirar(retiro);
            case 3:

            case 4:

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }

    }
}