import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private double DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, double DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //Metodos
    //IMC
    public int pesoIdeal(double a, double b){
        double op1 = (Math.pow(b, 2));
        int pesoIde = (int) (a/(op1));
        if(pesoIde < 20){
            pesoIde = -1;
        }else if(pesoIde >= 20 && pesoIde <= 25){
            pesoIde = 0;
        }else if(pesoIde > 25){
            pesoIde = 1;
        }
        return pesoIde;
    }

    //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(int a){
        int mayoriaDeEdad = 18;
        boolean respuesta = false;
        if (a > mayoriaDeEdad){
            respuesta = true;
        }
        return respuesta;
    }

    //Comprobar Sexo
    private void comprobarSexo(){
        this.sexo = 'H';

    }
    private void sexoFemenino(){
        this.sexo = 'M';
    }

    public String dni(){
        int aleatorio = 0;
        Random r  = new Random();
        aleatorio = (int)(r.nextInt(999999999-100000000+1)+100000000);
        int a = (int) (Math.random()*100000000);
        String DNI = a+"F";
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
