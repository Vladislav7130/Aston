
package aston2;

public class Aston2 {

    public static void main(String[] args) {
       Reader reader = new Reader();
        reader.Scan(); 
        compare(reader.i);
    }
    public static void compare(String x){
        if (x.equals("Вячеслав")){
          System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
