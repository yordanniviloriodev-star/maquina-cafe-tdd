package maquinadecafe;

import java.util.Scanner;

/** Versión de consola: usa la misma lógica validada por las pruebas. */
public class Main {

    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(new Cafetera(50));
        maquina.setVasosPequeno(new Vaso(5, 3));
        maquina.setVasosMediano(new Vaso(5, 5));
        maquina.setVasosGrande(new Vaso(5, 7));
        maquina.setAzucarero(new Azucarero(20));

        Scanner sc = new Scanner(System.in);
        System.out.println("=== MAQUINA DE CAFE (TDD) ===");

        while (true) {
            System.out.printf("Inventario -> Cafe: %d Oz | Vasos P/M/G: %d/%d/%d | Azucar: %d cdas%n",
                    maquina.getCafetera().getCantidadCafe(),
                    maquina.getVasosPequeno().getCantidadVasos(),
                    maquina.getVasosMediano().getCantidadVasos(),
                    maquina.getVasosGrande().getCantidadVasos(),
                    maquina.getAzucarero().getCantidadAzucar());
            System.out.println("1) Pequeno (3 Oz)   2) Mediano (5 Oz)   3) Grande (7 Oz)   0) Salir");
            System.out.print("Seleccione el tamano: ");

            if (!sc.hasNextInt()) break;
            int opcion = sc.nextInt();
            if (opcion == 0) break;

            String tipo;
            switch (opcion) {
                case 1: tipo = "pequeno"; break;
                case 2: tipo = "mediano"; break;
                case 3: tipo = "grande"; break;
                default:
                    System.out.println("Opcion invalida.\n");
                    continue;
            }

            System.out.print("Cucharadas de azucar: ");
            if (!sc.hasNextInt()) break;
            int azucar = sc.nextInt();

            Vaso vaso = maquina.getTipoDeVaso(tipo);
            String resultado = maquina.getVasoDeCafe(vaso, 1, azucar);

            if (resultado.equals("Felicitaciones")) {
                System.out.printf("Felicitaciones! Recoja su vaso %s de %d Oz con %d cucharada(s) de azucar.%n%n",
                        tipo, vaso.getContenido(), azucar);
            } else {
                System.out.println(resultado + "\n");
            }
        }
        System.out.println("Hasta luego!");
    }
}
