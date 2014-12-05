package Model;

public class Processador {
    private final int id;
    private float valorFrequencia;
    private String unidadeFrequencia;
    private int numNucleos;
    private String fabricante;

    public Processador(int id, float valorFrequencia, String unidadeFrequencia, int numNucleos, String fabricante) {
        this.id = id;
        this.valorFrequencia = valorFrequencia;
        this.unidadeFrequencia = unidadeFrequencia;
        this.numNucleos = numNucleos;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }
    
    public float getValorFrequencia() {
        return valorFrequencia;
    }

    public void setValorFrequencia(float valorFrequencia) {
        this.valorFrequencia = valorFrequencia;
    }

    public String getUnidadeFrequencia() {
        return unidadeFrequencia;
    }

    public void setUnidadeFrequencia(String unidadeFrequencia) {
        this.unidadeFrequencia = unidadeFrequencia;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}