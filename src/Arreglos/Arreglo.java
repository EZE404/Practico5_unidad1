package Arreglos;

public class Arreglo {

    public static void sumarLista(int[] lista) {
        int suma = 0;
        int cant = 0;
        for (int num : lista) {
            suma += num;
            cant++;
        }
        System.out.println("La suma de los " + cant + " números de la lista es "
                + suma + ", dando un promedio de " + suma / cant);
    }

    public static int buscarMayor(int[] lista) {
        int mayor = lista[0];
        for (int num : lista) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public static int cuentaVocales(String string) {
        int cant = 0;
        for (char letra : string.toLowerCase().toCharArray()) {
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cant++;
                    break;
            }
        }
        return cant;
    }

    public static int cuentaCaracter(String cadena, char c) {
        int cant = 0;
        for (char it : cadena.toCharArray()) {
            if (it == c) {
                cant++;
            }
        }
        return cant;
    }

}
