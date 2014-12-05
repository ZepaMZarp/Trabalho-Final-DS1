package Model;

public class Computador {
    private final int id;
    private Processador processador;
    private Memoria memoria;
    private PlacaVideo placaVideo;
    private String sistemaOperacional;
    private boolean temWebcam;
    private boolean temWireless;

    public Computador(int id, Processador processador, Memoria memoria, PlacaVideo placaVideo, String sistemaOperacional, boolean temWebcam, boolean temWireless) {
        this.id = id;
        this.processador = processador;
        this.memoria = memoria;
        this.placaVideo = placaVideo;
        this.sistemaOperacional = sistemaOperacional;
        this.temWebcam = temWebcam;
        this.temWireless = temWireless;
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

    public PlacaVideo getPlacaVideo() {
        return placaVideo;
    }

    public void setPlavaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean temWebcam() {
        return temWebcam;
    }

    public void setTemWebcam(boolean temWebcam) {
        this.temWebcam = temWebcam;
    }

    public boolean temWireless() {
        return temWireless;
    }

    public void setTemWireless(boolean temWireless) {
        this.temWireless = temWireless;
    }
}