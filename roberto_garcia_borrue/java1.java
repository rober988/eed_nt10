package java1;

import java.util.Scanner;

public class java1 {
System.out.print("introduce el primer numero ");
        Scanner teclado = new Scanner(System.in);
        int num1 ;
        num1 = teclado.nextInt();
        System.out.print("introduce el segundo numero ");
        int num2 ;
        num2 = teclado.nextInt();
        if (num1 > num2) {
            int rever = num1;
            num1 = num2;
            num2 = rever;
        }
        int contadorPares = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("hay " + contadorPares + " números pares entre " + num1 + " y " + num2);
        
}