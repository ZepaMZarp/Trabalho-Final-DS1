package Model;

public class PlacaVideo {
    private final int id;
    private Processador processador;
    private Memoria memoria;
    private String fabricante;

    public PlacaVideo(int id, Processador processador, Memoria memoria, String fabricante) {
        this.id = id;
        this.processador = processador;
        this.memoria = memoria;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }
    
    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}