public class Alumno { //los identificadores (nombres) de las clases comienzan por  MAY y va

    String DNI; //Atributos de instancia; son aquellos atributos de los que cada objeto va a tener un valor distinto

    private
    int NP;
    String nombreCompleto;

    public Alumno(){ //Metodo constructor por defecto, si no se indica nada, se asignan valores por defecto

        DNI="00.000.000-E";
        NP=0;
        nombreCompleto="Nombre Apellido1 Apellido2";

    }

    public  Alumno(String DNIp, int NPp, String nc){

        char primerDigito = DNI.charAt(0); // De la cadena DNIp dame le caracter que esta en la posicion 0

        if( !Character.isDigit(primerDigito) ) { // !Character.isDigit Si no se cumple esta hacer tal cosa
            throw new IllegalArgumentException("DNI incorrecto"); //Se pone arriba throws Exception para que no de error
        }

        if (NPp <= 0) {
            throw new IllegalArgumentException("NP incorrecto");
        }
        DNI = DNIp;
        NP = NPp;
        nombreCompleto = nc;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) { //Se agrega lo del IllegalArgumentException para al escribir un nombre raro, no lo acepte
        char primerDigito = DNI.charAt(0);
        if( !Character.isDigit(primerDigito) ) {
            throw new IllegalArgumentException("DNI incorrecto");
        }

        this.DNI = DNI;
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) {
        if (NP <= 0) {
            throw new IllegalArgumentException("NP incorrecto");
        }

        this.NP = NP;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "DNI='" + DNI + '\'' +
                ", NP=" + NP +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
