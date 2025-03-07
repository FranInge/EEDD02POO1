
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Alumno al= new Alumno(); //Cuando no se pone nada, se va a escribir el constructor por defecto que escribimos en la clase Alumno
        //Alumno al2 = new Alumno("00", -123, "davo"); Va a dar error porque el NP es menor a 0

        Alumno al2 = new Alumno("00.000.001-E", 123, "asdasdasda");

        Alumno al3 = al2; //Va a copiar todos los datos guardados en al2 y va a tener los mismo datos

        Alumno al4 = new Alumno("00.000.001-E", 123, "asdasdasda"); //Una nueva referencia y objeto, pero con los mismo datos que al2 y su direccion de memoria es distinta
        System.out.println("al: " + al.toString()); //"00 ... 0" 0 "nombre      "
        System.out.println("al2: " + al2.toString()); //"00 ... 1-E" 123 "adasdasdasd   "
        System.out.println("al3: " + al3.toString()); //"00 ... 1-E" 123 "adasdasdasd   "
        System.out.println("al4: " + al4.toString()); //"00 ... 1-E" 123 "adasdasdasd   "

        //System.out.println("al2 universidad: " + al2.getUniversidad()); //No se puede llamar, porque es un metodo de clase (no de instancia)
        System.out.println("al2 universidad: " + Alumno.getUniversidad()); //Se llama de esta forma porque es un metodo de clase

        //al3.DNI="00.000.002-E"; //No se puede cambiar el DNI porque esta en private el valor del atributo

        al3.setDNI("00.000.002-E"); //De esta forma si se puede cambiar el valor de DNI
        //al4.setDNI("A0.000.002-E"); //Va a dar error porque el primer digito no es un numero
        //al4.setNP(-3); No es posible asignar un NP menor a 0

        int a=19;
        int b=a;
        if (a==b){
            System.out.println("a y b son enteros que tienen el mismo valor");
        }

        if(al==al2){
            System.out.println("al y al2 son referencias que tienen el mismo valor");
        } else {
            System.out.println("al y al2 son referencias que no tienen el mismo valor");
        }

        if(al2==al3){
            System.out.println("al2 y al3 son referencias que tienen el mismo valor");
        } else {
            System.out.println("al2 y al3 son referencias que no tienen el mismo valor");
        }

        if(al2==al4){
            System.out.println("al2 y al4 son referencias que tienen el mismo valor");
        } else {
            System.out.println("al2 y al4 son referencias que no tienen el mismo valor, porque no tienen la misma direccion de memoria");
        }

        if(al2.equals (al4)){
            System.out.println("al2 y al4 son objetos que se cosnideran iguales porque tienen el mismo DNI");
        } else {
            System.out.println("al2 y al4 son objetos que se NO cosnideran iguales porque NO tienen el mismo DNI");
        }

        if(al2.hashCode() == al4.hashCode()){
            System.out.println("al2 y al4 son objetos que se tienen el mismo hashCode");//Tienen la misma longitud
        } else {
            System.out.println("al2 y al4 son objetos que se NO tienen el mismo hashCode");
        }

        if(al.equals (al4)){
            System.out.println("al y al4 son objetos que se cosnideran iguales porque tienen el mismo DNI");
        } else {
            System.out.println("al y al4 son objetos que se NO cosnideran iguales porque NO tienen el mismo DNI");
        }

        if(al.hashCode() == al4.hashCode()){
            System.out.println("al y al4 son objetos que se tienen el mismo hashCode");//Tienen la misma longitud
        } else {
            System.out.println("al y al4 son objetos que se NO tienen el mismo hashCode");
        }
    }
}