package Model;

public class Jogo {
    private int id;
    private String nome;
    private String descricao;
    private Processador minReqProcessador;
    private Memoria minReqMemoria;
    private PlacaVideo minReqPlacaVideo;
    private String[] reqSistemasOperacionais;
    private boolean precisaWireless;
    private boolean precisaWebcam;
    private float preco;

    public Jogo(int id, String nome, String descricao, Processador minReqProcessador, Memoria minReqMemoria, PlacaVideo minReqPlacaVideo, String[] reqSistemasOperacionais, boolean precisaWireless, boolean precisaWebcam, float preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.minReqProcessador = minReqProcessador;
        this.minReqMemoria = minReqMemoria;
        this.minReqPlacaVideo = minReqPlacaVideo;
        this.reqSistemasOperacionais = reqSistemasOperacionais;
        this.precisaWireless = precisaWireless;
        this.precisaWebcam = precisaWebcam;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Processador getMinReqProcessador() {
        return minReqProcessador;
    }

    public void setMinReqProcessador(Processador minReqProcessador) {
        this.minReqProcessador = minReqProcessador;
    }

    public Memoria getMinReqMemoria() {
        return minReqMemoria;
    }

    public void setMinReqMemoria(Memoria minReqMemoria) {
        this.minReqMemoria = minReqMemoria;
    }

    public PlacaVideo getMinReqPlacaVideo() {
        return minReqPlacaVideo;
    }

    public void setMinReqPlacaVideo(PlacaVideo minReqPlacaVideo) {
        this.minReqPlacaVideo = minReqPlacaVideo;
    }

    public String[] getReqSistemasOperacionais() {
        return reqSistemasOperacionais;
    }

    public void setReqSistemasOperacionais(String[] reqSistemasOperacionais) {
        this.reqSistemasOperacionais = reqSistemasOperacionais;
    }

    public boolean precisaWireless() {
        return precisaWireless;
    }

    public void setPrecisaWireless(boolean precisaWireless) {
        this.precisaWireless = precisaWireless;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean precisaWebcam() {
        return precisaWebcam;
    }

    public void setPrecisaWebcam(boolean precisaWebcam) {
        this.precisaWebcam = precisaWebcam;
    }
}