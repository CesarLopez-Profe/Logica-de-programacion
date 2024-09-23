/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ciclos;
import java.util.Scanner;


public class App {
    
    public static String Verde = "\u001B[32m",
        Rojo = "\u001B[31m",
        Negro = "\u001B[30m",
        Amarillo = "\u001B[33m",
        Azul = "\u001B[34m",
        Purpura = "\u001B[35m",
        CYAN = "\u001B[36m",
        Blanco = "\u001B[37m",
        RESET = "\u001B[0m";
    
    public String getGreeting() {
        return "Hello World!";
    }
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            String opcion_1, opcion2 = "", seleccion_nivel1="";

            do { 
                
                System.out.println(CYAN + "1. Tiquetes Aereos\n" 
                    + "2. Tiquetes Terrestres\n"
                    + "3. Tiquetes Tren\n"
                    + "0. Para salir\n"
                    + "Seleccione su opción"
                    + RESET);
                opcion_1 = teclado.next();

                switch(opcion_1.charAt(0)){
                    case '1': seleccion_nivel1 = "Tiquete aéreo";
                        do {
                            System.out.println("1. Nacionales\n"
                            + "2. Internacionales\n"
                            + "3. Volver al menu anterior\n"
                            + "Seleccione su opción"
                            );
                            opcion2 = teclado.next();

                            switch(opcion2.charAt(0)){
                                case '1': System.out.println("Seleccionó " + seleccion_nivel1 + " nacional");
                                    break;
                                case '2': System.out.println("Seleccionó " + seleccion_nivel1 + " iternacional");
                                    break;
                                case '3': System.out.println("Retorno al menún anterior");
                                    break;
                                default: 
                                    System.out.println("Opción no válida");

                            }

                        }while(opcion2.charAt(0) != '3');
                        break;
                        case '2': seleccion_nivel1 = "Tiquete Terrestre";
                        break;
                        case '3': seleccion_nivel1 = "Tiquete Tren";
                        break;                        
                        case '0': System.out.println(Verde + "Finalizó" + RESET);
                        break;
                        default: System.out.println(Rojo + "Opción no válida" + RESET);
                }


            } while (opcion_1.charAt(0)!='0');
            
            

        } 
        catch (Exception e) {
            System.out.println(e.toString());
        }

    }



} 




