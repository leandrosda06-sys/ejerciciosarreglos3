
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 10;
        Sensor sensores[] = new Sensor[MAX];

        int cantidadRegistrada = 0;
        int opcion;

        do {
            System.out.println("\n--- MENU SENSORES ---");
            System.out.println("1. Registrar varios sensores");
            System.out.println("2. Mostrar sensores");
            System.out.println("3. Actualizar lectura");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Cuantos sensores desea ingresar: ");
                    int cantidad = Integer.parseInt(sc.nextLine());

                    if (cantidad > 0 &&
                            cantidadRegistrada + cantidad <= sensores.length) {

                        int contador = 0;

                        while (contador < cantidad) {
                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();

                            System.out.print("Tipo: ");
                            String tipo = sc.nextLine();

                            System.out.print("Lectura: ");
                            double lectura =
                                    Double.parseDouble(sc.nextLine());

                            sensores[cantidadRegistrada] =
                                    new Sensor(nombre, tipo);

                            sensores[cantidadRegistrada].setLectura(lectura);

                            cantidadRegistrada++;
                            contador++;
                        }
                    } else {
                        System.out.println("Cantidad invalida o sin espacio");
                    }
                    break;

                case 2:
                    for (int i = 0; i < cantidadRegistrada; i++) {
                        System.out.println("\nSensor " + i);
                        sensores[i].mostrarDatos();
                    }
                    break;

                case 3:
                    System.out.print("Indice del sensor: ");
                    int indice = Integer.parseInt(sc.nextLine());

                    if (indice >= 0 && indice < cantidadRegistrada) {
                        System.out.print("Nueva lectura: ");
                        double nueva =
                                Double.parseDouble(sc.nextLine());

                        sensores[indice].actualizarLectura(nueva);
                    } else {
                        System.out.println("Indice no valido");
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);

        sc.close();
    }
}
