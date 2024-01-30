package Procesando;

import Procesando.model.Camiseta;
import Procesando.model.Pantalon;

import java.sql.SQLOutput;
import java.util.Scanner;
import Procesando.constantes.Constantes;
import Procesando.model.Prenda;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipo=0;
        int material=0;
        String matAsignado = "";
        int color=0;
        String colAsignado= "";

        while (tipo!= 1 && tipo!=2){
            System.out.println("Introduce la prenda");
            System.out.println("1.Pantalon");
            System.out.println("2.Camiseta");
            tipo = scanner.nextInt();
            if (tipo!= 1 && tipo!=2){
                System.out.println("Prenda no existente. Introduce un numero correcto");
            }
        }
        while (material!= 1 && material!=2 && material!=3 && material!=4 && material!=5
                && material!=6 && material!=7){
            System.out.println("Introduce el material");
            System.out.printf("1. %s\n",Constantes.MATERIAL_ALGODON);
            System.out.printf("2. %s\n",Constantes.MATERIAL_POLIESTER);
            System.out.printf("3. %s\n",Constantes.MATERIAL_LINO);
            System.out.printf("4. %s\n",Constantes.MATERIAL_LANA);
            System.out.printf("5. %s\n",Constantes.MATERIAL_SEDA);
            System.out.printf("6. %s\n",Constantes.MATERIAL_NYLON);
            System.out.printf("7. %s\n",Constantes.MATERIAL_LICRA);

            material = scanner.nextInt();
            switch (material){
                case 1:
                    matAsignado= Constantes.MATERIAL_ALGODON;
                    break;
                case 2:
                    matAsignado= Constantes.MATERIAL_POLIESTER;
                    break;
                case 3:
                    matAsignado= Constantes.MATERIAL_LINO;
                    break;
                case 4:
                    matAsignado= Constantes.MATERIAL_LANA;
                    break;
                case 5:
                    matAsignado= Constantes.MATERIAL_SEDA;
                    break;
                case 6:
                    matAsignado= Constantes.MATERIAL_NYLON;
                    break;
                case 7:
                    matAsignado= Constantes.MATERIAL_LICRA;
                    break;

                default:
                    System.out.println("Material no existente. Introduce un numero correcto");
            }

        }
        while (color!= 1 && color!=2 && color!=3 && color!=4){
            System.out.println("Introduce el color");
            System.out.printf("1.%s\n",Constantes.COLOR_BLANCO);
            System.out.printf("2.%s\n",Constantes.COLOR_VERDE);
            System.out.printf("3.%s\n",Constantes.COLOR_AZUL);
            System.out.printf("4.%s\n",Constantes.COLOR_NEGRO);

            color = scanner.nextInt();
            switch (color){
                case 1:
                    colAsignado = Constantes.COLOR_BLANCO;
                    break;
                case 2:
                    colAsignado = Constantes.COLOR_VERDE;
                    break;
                case 3:
                    colAsignado = Constantes.COLOR_AZUL;
                    break;
                case 4:
                    colAsignado = Constantes.COLOR_NEGRO;
                    break;

                default:
                    System.out.println("Color no existente. Introduce un numero correcto");
            }
        }
        Camiseta camiseta = new Camiseta(matAsignado,colAsignado);
        Pantalon pantalon = new Pantalon(matAsignado,colAsignado);

    }
}
