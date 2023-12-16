package aston1;
public class Aston1 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.Scan();
        compare(reader.i);
        
    }   
    public static void compare(int x){
        if (x > 7){
          System.out.println("Привет");
        } 
    }
}

