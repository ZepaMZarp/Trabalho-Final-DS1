package Model;

public class Memoria {
    private final int id;
    private int valorCapacidade;
    private String unidadeCapacidade;
    private String tecnologia;
    private String fabricante;

    public Memoria(int id, int valorCapacidade, String unidadeCapacidade, String tecnologia, String fabricante) {
        this.id = id;
        this.valorCapacidade = valorCapacidade;
        this.unidadeCapacidade = unidadeCapacidade;
        this.tecnologia = tecnologia;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }
    
    public int getValorCapacidade() {
        return valorCapacidade;
    }

    public void setValorCapacidade(int valorCapacidade) {
        this.valorCapacidade = valorCapacidade;
    }

    public String getUnidadeCapacidade() {
        return unidadeCapacidade;
    }

    public void setUnidadeCapacidade(String unidadeCapacidade) {
        this.unidadeCapacidade = unidadeCapacidade;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}