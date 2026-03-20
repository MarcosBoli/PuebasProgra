public class Cronometro {
    private int segundos;
    private int minutos;
    private int horas;

    public Cronometro (int segundos, int minutos, int horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        normalizar();
    }

    public void normalizar () {
        if (segundos >= 60) {
            int segundosTemporal = segundos;
            segundos = segundos%60;
            minutos = minutos + segundosTemporal/60;
        }
         if (minutos >= 60) {
            int minutosTemporal = minutos;
            minutos = minutos%60;
            horas = horas + minutosTemporal/60;
        }
    
    }
}
