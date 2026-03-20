package Prueba.Marcos.PruebaTiempo;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    
    private void regularizar(Tiempo maximo){

        int segundos=59;
        int minutos=59;

        if(this.segundos>segundos){
            this.minutos=this.minutos+1;
        }
        

    }
}
