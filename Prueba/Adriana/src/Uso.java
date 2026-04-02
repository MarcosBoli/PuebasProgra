import java.util.Scanner;

public class Uso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa segundos");
        int segundos = scanner.nextInt();

        System.out.println("Ingresa minutos");
        int minutos = scanner.nextInt();
        
        System.out.println("Ingresa horas");
        int horas = scanner.nextInt();
        

        
        Cronometro cronometro = new Cronometro (segundos, minutos, horas);

        System.err.println(cronometro);

         System.out.println("Ingresa segundos de otro Tiempo");
        int otroSegundos = scanner.nextInt();

        System.out.println("Ingresa minutos de otro Tiempo");
        int otroMinutos = scanner.nextInt();
        
        System.out.println("Ingresa horas de otro Tiempo");
        int otroHoras = scanner.nextInt();

        Cronometro otroTiempo = new Cronometro (otroSegundos, otroMinutos, otroHoras);


        switch (opcion) {
            case 1: Cronometro sumar = cronometro.sumar(otroTiempo);

            case 2: boolean iguales
                
            default: System.out.println("Opcion no valida.");

            }
        }
        scanner.close();
    }

    

}
