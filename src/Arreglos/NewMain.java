package Arreglos;

public class NewMain {

    public static void main(String[] args) {
        
        int[] arregloEnteros = {1, 3, 6, 57, 5};
        Arreglo.sumarLista(arregloEnteros);
        System.out.println("El mayor número de la lista es el " + Arreglo.buscarMayor(arregloEnteros));
        System.out.println("Cantidad de vocales: "+ Arreglo.cuentaVocales("QWT aeiou AEIOU qwt"));
        System.out.println("Cantidad de dicho caracter: " + Arreglo.cuentaCaracter("Ezequiel++", '+'));
    }

}
