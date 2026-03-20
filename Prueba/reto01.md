⏱️ Reto 005: La Máquina del Tiempo
Contexto:
Diseñe e implemente la clase Tiempo. Esta clase servirá para almacenar una duración (como si fuera un cronómetro) y debe ser capaz de autorregularse para no tener formatos extraños. Por ejemplo, en la vida real nadie dice "tengo 0 horas y 70 minutos", decimos "tengo 1 hora y 10 minutos". Tu objeto debe ser lo suficientemente inteligente para hacer esta conversión por sí solo.

Requisitos de la clase Tiempo
1. Estado (Atributos)
Define los datos que componen el objeto aplicando las reglas de encapsulamiento:

Tres atributos protegidos: horas, minutos y segundos (todos de tipo int).

2. Herramienta interna (El ajuste de tuercas)
Crea un método privado llamado normalizar(). Su trabajo es arreglar los atributos por dentro para que los segundos y los minutos nunca pasen de 59.

Pista matemática: Si tienes 75 segundos, debes sumarle 1 a los minutos y quedarte con 15 segundos. Puedes hacerlo con bucles while (segundos >= 60) o usando matemáticas puras (minutos = minutos + segundos / 60; y luego segundos = segundos % 60;). ¡Usa la lógica que te resulte más intuitiva!

3. El Constructor (La fábrica)
Debe recibir las horas, minutos y segundos iniciales por los parámetros (la "ranura").

Debe guardar esos valores en los atributos usando this.

Crucial: Justo antes de terminar (antes de cerrar la llave del constructor), debe llamar a tu método interno this.normalizar(); para que el tiempo nazca ya arreglado de fábrica.

4. Comportamiento (Métodos públicos)
Implementa las siguientes acciones para que el Main pueda interactuar con el tiempo:

public String toString(): Debe devolver el estado del objeto en formato texto. Por ejemplo: "2h 15m 30s".

public boolean esIgual(Tiempo otroTiempo): Debe comprobar si las horas, minutos y segundos de tu objeto coinciden exactamente con los del objeto que entra de visita por la ranura.

public Tiempo sumar(Tiempo otroTiempo): Debe sumar tus horas con sus horas, tus minutos con sus minutos y tus segundos con sus segundos. Tras hacer el cálculo matemático, debe devolver un objeto Tiempo totalmente nuevo con el resultado (¡recuerda usar return new para no destruir tu tiempo original!).

🎯 Prueba de validación (El Main)
Cuando termines de diseñar tu molde Tiempo.java, crea este archivo Main.java en la misma carpeta. Si ejecutas este código y la consola muestra exactamente los resultados esperados en los comentarios, ¡habrás superado el reto con un 10!

Java
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
        System.out.println("¿Son iguales t1 y t2? " + t1.esIgual(t2)); 
    }
}