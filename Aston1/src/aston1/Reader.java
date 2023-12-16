package aston1;

import java.util.Scanner;

public class Reader {
    int i;
    public void Scan(){
        System.out.println("Введите число:");
        Scanner scn = new Scanner(System.in);
        i = scn.nextInt();
    }
}