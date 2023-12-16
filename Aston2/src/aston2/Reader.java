
package aston2;

import java.util.Scanner;

public class Reader {
    String i = new String();
    public void Scan(){
        System.out.println("Введите имя:");
        Scanner scn = new Scanner(System.in);
        i = scn.nextLine();
    }
}
