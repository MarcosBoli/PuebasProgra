package Prueba.Marcos.PruebaTiempo;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        this.regularizar();
    }
    
    private void regularizar(){

        int segundos=60;
        int minutos=60;

        while(this.segundos>=segundos){
            this.minutos=this.minutos+1;
            this.segundos=this.segundos-segundos;
            while(this.minutos>=minutos){
                this.horas=this.horas+1;
                this.minutos=this.minutos-minutos;
            }
        }
    }

    public String toString(){
        return horas+"  horas, "+minutos+" minutos, "+segundos+" segundos.";
    }

    public boolean equals(Tiempo otro){
        if((this.horas==otro.horas) && (this.minutos==otro.minutos) && (this.segundos==otro.segundos)){
            return true;
        }else {
            return false;
        }
    }

    public Tiempo sumar(Tiempo otro){
        horas=this.horas+otro.horas;
        minutos=this.minutos+otro.minutos;
        segundos=this.segundos+otro.segundos;
        return new Tiempo(horas, minutos, segundos);
    }

}
