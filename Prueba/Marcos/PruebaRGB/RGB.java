package Prueba.Marcos.PruebaRGB;

public class RGB {

    private int red;
    private int green;
    private int blue;
    final int MAXIMO = 255;
    final int MINIMO = 0;

    public RGB(int red, int green, int blue) {
        this.red = asegurar(red);
        this.green = asegurar(green);
        this.blue = asegurar(blue);
    }

    private int asegurar(int valor) {
        if (valor < MINIMO) {
            return MINIMO;
        } else if (valor > MAXIMO) {
            return MAXIMO;
        } else {
            return valor;
        }
    }

    public String toString() {
        return "(R: " + red + ", G: " + green + ", B: " + blue + ")";
    }

    public boolean equals(RGB otro) {
        if (this.red == otro.red && this.green == otro.green && this.blue == otro.blue) {
            return true;
        } else {
            return false;
        }
    }

    public RGB mezclar(RGB otro) {
        int red = (this.red + otro.red) / 2;
        int green = (this.green + otro.green) / 2;
        int blue = (this.green + otro.green) / 2;
        return new RGB(red, green, blue);

    }

    public RGB invertir() {
        int red = MAXIMO - this.red;
        int green = MAXIMO - this.green;
        int blue = MAXIMO - this.blue;
        return new RGB(red, green, blue);
    }

}
