package invertirarray;
import java.util.Scanner;

public class InvertirArray {
    
    
    public static String[] invertirArray(String[] arreglo) {
        String[] invertido = new String[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            array[i] = sc.nextLine();
        }


        System.out.print("Arreglo original: ");
        for (String s : array) {
            System.out.print(s + " ");
        }

        
        String[] invertido = invertirArray(array);
        System.out.print("\nArreglo invertido: ");
        for (String s : invertido) {
            System.out.print(s + " ");
        }

        sc.close();
        
    }
    
}
