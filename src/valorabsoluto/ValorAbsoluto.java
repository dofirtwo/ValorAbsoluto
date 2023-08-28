package valorabsoluto;

import java.util.Scanner;
public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double valor;
        System.out.println("ingrese un valor");
        valor=sc.nextDouble();
        if(valor<0){
            double valorR=valor*(-1);
            System.out.println("el valor absoluto es:"+" "+valorR);
        }else{
            System.out.println("el valor absoluto es:"+" "+valor);
        }
    }
    
}
