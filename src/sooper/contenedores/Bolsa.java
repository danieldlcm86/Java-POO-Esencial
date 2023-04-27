package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor{
    private int ancho;
    public Bolsa(String referencia, int alto, int ancho, int resistencia) {
        super(referencia, alto, resistencia);
        this.ancho = ancho;
    }

    @Override
    public int getSuperficie() {
        int radio = getDiametro()/2;
        return (int)(Math.PI * radio * radio);
    }

    private int getDiametro() {
        return (int)((ancho * 2) / Math.PI);
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }
}
