package Prueba.Marcos.PruebaTiempo;

public class Main {
    public static void main(String[] args) {
        
        // 1. Creamos un tiempo con demasiados segundos y minutos
        Tiempo t1 = new Tiempo(1, 65, 70); 
        // Como el constructor llama a normalizar(), debería imprimir "2h 6m 10s"
        System.out.println("Tiempo 1 arreglado: " + t1.toString()); 

        // 2. Creamos otro tiempo normal
        Tiempo t2 = new Tiempo(0, 50, 20);
        System.out.println("Tiempo 2: " + t2.toString()); 

        // 3. Los sumamos creando uno nuevo
        Tiempo resultado = t1.sumar(t2);
        // La suma bruta sería 2h 56m 30s. Como no pasa de 60, se queda igual.
        System.out.println("La suma es: " + resultado.toString()); 
        
        // 4. Comprobamos si son iguales
        // Debería imprimir false
        System.out.println("¿Son iguales t1 y t2? " + t1.equals(t2)); 
    }
}