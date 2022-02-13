import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;

public class tallerEvaluacion {
    /////////////////////////////maximos y minimos ////////////////////////////////
    public static int numerosMaxyMin(int a, int b){
        // Identificar si un numero es mayor o igual al otro
        int numeroMaximo = Math.max(a,b);
        int numeroMinimo = Math.min(a,b);
        if(a == b){
            System.out.println(a + " Es igual a " + b);
        }else{
            System.out.println("El mayor es: " + numeroMaximo + " El menor es: " + numeroMinimo);
        }

        return b;
    }
    /////////////////////////////Radio de un circulo ////////////////////////////////
    public static Double radioDeCirculo(double a){
        double area = Math.pow(a,2) * Math.PI;
        System.out.println("El area de tu círculo es: "+ area );

        return area;
    }
    /////////////////////////////PRECIO CON IVA ////////////////////////////////
    public static void precioMasIva(int a) {
        int operacion = a*21/100;
        int precioTotal = operacion+a;
        System.out.println("precio total con iva es de: "+ precioTotal);
    }
    /////////////////////////////PARES E IMPARES WHILE////////////////////////////////
    public static void numerosParImparWhile(){
        int contador = 0;
        int pares[]= new int[50];
        int impares [] = new int[50];
        while (contador <= 100){
            int bandPares = 0;
            int bandImpares = 0;
            if(contador % 2 == 0){
                pares[bandPares] = contador;
                System.out.println("par " + contador);
                bandPares++;
            }else{
                impares[bandImpares] = contador;
                System.out.println("impar " + contador);
                bandImpares++;
            }
            contador++;
        }
    }
    /////////////////////////////PARES E IMPARES FOR////////////////////////////////
    public static void parImparFor(){
        for (int i =0; i <= 100 ; i++ ){
            if(i % 2 == 0){
                System.out.println("par " + i);
            }else{
                System.out.println("impar " + i);
            }

        }

    }
    /////////////////////////////MAYOR O IGUAL QUE CERO DO WHILE////////////////////////////////
    public static void mayorOIgualDoWhile(){
        int numeroWhile;

        do{
            Scanner numero = new Scanner(System.in);
            System.out.println("Digite un nuemero");
            numeroWhile = numero.nextInt();

        }while (numeroWhile != 0);

    }
    /////////////////////////////DIA DE LA SEMANA////////////////////////////////
    public static void diaLaboral(){
        String verificarDia;
        Scanner dia = new Scanner(System.in);
        System.out.println("Digite el dia que quiera saber si es laboral, la primera en Mayuscula");
        verificarDia = dia.nextLine();

        switch (verificarDia){
            case "Lunes" :
                System.out.println("Dia laboral");
                break;
            case "Martes":
                System.out.println("Dia Laboral");
                break;
            case "Miercoles" :
                System.out.println("Dia laboral");
                break;
            case "Jueves":
                System.out.println("Dia Laboral");
                break;
            case "Viernes" :
                System.out.println("Dia laboral");
                break;
            case "Sabado":
                System.out.println("Dia no Laboral");
                break;
            case "Domingo" :
                System.out.println("Dia no Laboral");
                break;
            case "Lunes Festivo":
                System.out.println("Dia no Laboral");
                break;


        }

    }
    /////////////////////////////LA SONRISA 9.////////////////////////////////
    public static void laSonrisa(){
        Scanner texto = new Scanner(System.in);
        System.out.println("DIGITA TU TEXTO COMO QUIERAS, si escribes 1, SE USARA EL TEXTO POR DEFECTO");
        String txt = texto.nextLine();
        if(txt.charAt(0) == '1'){
            txt = "La sonrisa sera la mejor arma contra la tristeza";
        }
        System.out.println(txt);
        String a ="";
        for(int i = 0 ; i < txt.length() ; i++ ){
            if(txt.charAt(i) == 'a'){
                a = a + 'e';
            }else if(txt.charAt(i) == 'o'){
                a = a + 'a';
            }else{
                a = a + txt.charAt(i);
            }
        }
        System.out.println(a);
    }
    /////////////////////////////APP POR CONSOLA SIN ESPACIOS .10////////////////////////////////
    public static void appSinEspacios(){
        Scanner texto = new Scanner(System.in);
        String txt = texto.nextLine();
        String a ="";
        for(int i = 0 ; i < txt.length() ; i++ ){
            if(txt.charAt(i) != ' '){
                a = a + txt.charAt(i);
            }
        }
        System.out.println(a);
    }
    /////////////////////////////ACONTANDO LAS VOCALES Y TAMAÑO .11////////////////////////////////
    public static void contandoVocales(){
        Scanner texto = new Scanner(System.in);
        String txt = texto.nextLine();
        System.out.println("La cantidad de Caracteres es: " + txt.length());
        int vocales = 0;
        for(int i = 0 ; i < txt.length() ; i++ ){
            switch (txt.charAt(i)){
                case 'a':
                    vocales++;
                    break;
                case 'e':
                    vocales++;
                    break;
                case 'i':
                    vocales++;
                    break;
                case 'o':
                    vocales++;
                    break;
                case 'u':
                    vocales++;
                    break;
            }

        }
        System.out.println("La cantidad de Vocales es " + vocales);
    }
    /////////////////////////////DIFERENCIAS ENTRE PALABRAS .12////////////////////////////////
    public static void diferenciasEntrePalabras(){
        Scanner texto = new Scanner(System.in);
        System.out.println("ingresa tu primera palabra");
        String txt = texto.nextLine();
        System.out.println("ingresa tu primera palabra");
        String txt2 = texto.nextLine();
        int a = 1;

        if(txt.equals(txt2)){
            System.out.println("Tus palabras son exactamente iguales");
        }else{
            for(int i = 0 ; i < txt.length() ; i++ ){

                if(txt.charAt(i) != txt2.charAt(i)){
                    System.out.println("Letras " + a + " " + txt.charAt(i) + " Es difeente a " + txt2.charAt(i));
                    a++;
                }else{
                    System.out.println("Letras " + a + " " + txt.charAt(i) + " Es Igual a " + txt2.charAt(i));

                }
            }
        }


    }
    /////////////////////////////FECHAS Y FORMATO .13////////////////////////////////
    public static void fechasYFormato(){
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("YYYY/MM/DD HH:MM:SS");

        System.out.println(formateador.format(fecha));


    }

    /////////////////////////////Saltos De 2 en 2 .14////////////////////////////////
    public static void saltoDe2En2(){
        Scanner Numeros = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num1 = Numeros.nextInt();
        int i = num1;
        do {
            i=i+2;
            System.out.println(i);

        }while (i<1000);

    }
    /////////////////////////////GESTION CINEMATOGRAFICA .15////////////////////////////////
    public static void gestionCinematografica(){
        Scanner Numeros = new Scanner(System.in);
        System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                "        1-NUEVO ACTOR\n" +
                "        2-BUSCAR ACTOR\n" +
                "        3-ELIMINAR ACTOR\n" +
                "        4-MODIFICAR ACTOR\n" +
                "        5-VER TODOS LOS ACTORES\n" +
                "        6- VER PELICULAS DE LOS ACTORES\n" +
                "        \n" +
                "        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "        8-SALIR");
        for(int i = 0; i<1; i++){
            int num1 = Numeros.nextInt();
            switch (num1){
                case 1:
                    i--;
                    System.out.println("NUEVO ACTOR");
                    break;
                case 2:
                    i--;
                    System.out.println("BUSCAR ACTOR");
                    break;
                case 3:
                    i--;
                    System.out.println("ELIMINAR ACTOR");
                    break;
                case 4:
                    i--;
                    System.out.println("MODIFICAR ACTOR");
                    break;
                case 5:
                    i--;
                    System.out.println("VER TODOS LOS ACTORES");
                    break;
                case 6:
                    i--;
                    System.out.println("VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    i--;
                    System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    i=2;
                    System.out.println("SALIR");
                    break;
                default:
                    i--;
                    System.out.println("Pon un numero valido");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        /*
        //Punto numero 1
        Scanner primerNumero =new Scanner(System.in);
        Scanner segundoNumero = new Scanner(System.in);
        System.out.println("ingrese El primer numero para verificar");
        int numeroUno = primerNumero.nextInt();
        System.out.println("ingrese El segundo numero para verificar");
        int numerodos = segundoNumero.nextInt();


        //Punto numero 2
        System.out.println("Tus numeros son: ");
        numerosMaxyMin(numeroUno,numerodos);
         */

        /*
        //Punto numero 3
        radioDeCirculo(r);
         */

        /*
        //Punto numero 4
        precioMasIva(precio);
         */

        /*
        //Punto numero 5
        numerosParImparWhile();
         */


        /*
        //Punto numero 6
        parImparFor();
         */

        /*
        //Punto numero 7
        mayorOIgualDoWhile();
        */

        /*
        //Punto numero 8
        diaLaboral();
         */

        /*
        //Punto numero 9
        laSonrisa();
         */

        /*
        //Punto numero 10
        appSinEspacios();
         */

        /*
        //Punto numero 11
        contandoVocales();
         */

        /*
        //Punto numero 12
        diferenciasEntrePalabras();
         */

        /*
        //Punto numero 13
        fechasYFormato();
         */

        /*
        //Punto numero 14
        saltoDe2En2();
         */

        /*
        //Punto numero 15
        gestionCinematografica();

         */





    }
}
