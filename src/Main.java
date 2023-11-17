import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int a=328;
        int b=50;
        int indexHash=a%b;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((float)a/b);
        System.out.println(a%b);//modulo

        Scanner teclado= new Scanner(System.in);

        int arregloInicialInt[]= {1,2,3,4,5};//ENTERO -2147483648 **** 0 ***** 2147483647

        // long   Entero de 64 bits
        //  short  Entero de 16 bits
        float arregloInicialFloat[]= {1,2,3,4,5};//FLOTANTE de 32 BIts para lo entero y para el punto decimal
        double arregloInicialDouble[]= {1,2,3,4,5};//FLOTANTE de 32 BIts para lo entero y para el punto decimal
        char letra='a';
        String arregloInicialString[]= {"Alberto","Biviana","Carlos","Daniela","Ernesto"};//ENTERO
        Integer arregloInicialInteger[]= {1,2,3,4,5};//ENTERO

        int normal= 0;
        Integer noNormal=100;
        //System.out.println(noNormal.byteValue());



        int arregloInicialInt2[]= new int[7];//
        arregloInicialInt2[0]=12;
        arregloInicialInt2[1]=12;
        arregloInicialInt2[3]=12;
        arregloInicialInt2[2]=12;
        arregloInicialInt2[6]=12;

        System.out.println("digite el tamaño del nuevo arreglo A3 :");
        int tamanio=teclado.nextInt();

        int arregloInicialInt3[]= new int[tamanio];//
        int modulo=50;

        for (int i=0;i<9;i++){
            System.out.println("digite el valor para la posicion "+i+" :");
            arregloInicialInt2[i]=teclado.nextInt();
        }



        int arregloHash[]= new int[50];//
        //arregloHash[0];


    }
}