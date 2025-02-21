
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Alumno al= new Alumno();
        Alumno al2 = new Alumno("00", -123, "asdasdasda");

        System.out.println("al: " + al.toString()); //"00 ... 0" 0 "nombre      "
        System.out.println("al2: " + al2.toString()); //"11" 123 "adasdasdasd   "
    }
}