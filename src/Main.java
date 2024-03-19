import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,i=0,cuadrad,sum=0, item;
        System.out.println(" digite un numero");
        n = entrada.nextInt();
        System.out.println("ingrese el numero del item segun el ciclo que desea utilizar");
        System.out.println("1: While ");
        System.out.println("2: For");
        System.out.println("3: Dowhile");
        item= entrada.nextInt();
        switch (item){
            case 1:

                while (i<=n) {
                    cuadrad = i*i;
                    sum = sum+cuadrad;
                    i++;

                    System.out.println("La suma de los cuadrados del numero"+n+" es: "+sum);
                }
                break;
            case 2: for (i=0;i<=n;i++){

                cuadrad = i*i;
                sum = sum+cuadrad;

                System.out.println("La suma de los cuadrados del numero"+n+" es: "+sum);
            }
                break;
            case 3: do {
                cuadrad = i*i;
                sum = sum+cuadrad;
                i++;
                System.out.println("La suma de los cuadrados del numero"+n+" es: "+sum);
            }while (i<=n);
                break;
        }
    }
}



