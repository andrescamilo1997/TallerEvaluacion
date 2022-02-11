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
    public static int precioMasIva(int a) {
        int precioTotal = ((a*21)/100)+a;
        System.out.println("precio total con iva es de: "+ precioTotal);
        return precioTotal;

    }
    /////////////////////////////PARES E IMPARES WHILE////////////////////////////////
    public static void numerosParImparWhile(){
        int contador = 0;
        int pares[];
        pares = new int[50];
        int impares [];
        impares = new int[50];
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

        /*Scanner primerNumero =new Scanner(System.in);
        Scanner segundoNumero = new Scanner(System.in);
        System.out.println("ingrese El primer numero para verificar");
        int numeroUno = primerNumero.nextInt();
        System.out.println("ingrese El segundo numero para verificar");
        int numerodos = segundoNumero.nextInt();


        //Numeros mayor y menor
        System.out.println("Tus numeros son: ");
        numerosMaxyMin(numeroUno,numerodos);
         */
        /*
        //Area de un circulo
        Scanner radio = new Scanner(System.in);
        System.out.println("Ingrese el radio de su circulo");
        int r = radio.nextInt();
        double ra = Double.parseDouble(String.valueOf(r));
        radioDeCirculo(r);
         */
        /*
        //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
        Scanner digitePrecio = new Scanner(System.in);
        System.out.println("Digite el precio del producto para calcularlo con iva");
        int  precio = digitePrecio.nextInt();
        precioMasIva(precio);

         */


        /*
        //Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
        numerosParImparWhile();
        */

        /*
        //Realiza el ejercicio anterior usando un ciclo for.
        parImparFor();
         */


        /*Lee un número por teclado y comprueba que este numero
        es mayor o igual que cero, si no lo es lo volverá a pedir (do while),
        después muestra ese número por consola.


        mayorOIgualDoWhile();
        */

        /*
        //Crea una aplicación por consola que nos pida un día de la semana
        // y que nos diga si es un día laboral o no. Usa un switch para ello.
        diaLaboral();

         */
        /*
        //Del texto,
        // Reemplaza todas las a del String anterior por una e,
        // adicionalmente concatenar a esta frase una adicional que ustedes quieran
        // incluir por consola y las muestre luego unidas.

        laSonrisa();

         */
        /*
        //Realizar una aplicación de consola,
        // que al ingresar una frase por teclado elimine los espacios que esta contenga.
        appSinEspacios();

         */
        /*
        //Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
        // indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene
        contandoVocales();

         */

        /*
        //Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
        diferenciasEntrePalabras();
         */

        /*
        //Realizar un algoritmo que permita consulta la fecha y hora actual
        // en el formato (AAAA/MM/DD) (HH:MM:SS)
        fechasYFormato();

         */

        /*
        //Crear un programa que pida un numero por teclado y que imprima por pantalla los números
        // desde el numero introducido hasta 1000 con saldos de 2 en 2.
        saltoDe2En2();

         */

        /*
        //Hacer un programa que muestre el siguiente menú de opciones
        //****** GESTION CINEMATOGRAFICA ********
        //1-NUEVO ACTOR
        //2-BUSCAR ACTOR
        //3-ELIMINAR ACTOR
        //4-MODIFICAR ACTOR
        //5-VER TODOS LOS ACTORES
        //6- VER PELICULAS DE LOS ACTORES
        //
        //7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
        //8-SALIR
        //
        //
        //EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO
        // OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE
        // DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
        //PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
        gestionCinematografica();

         */
        //16



    }
}
