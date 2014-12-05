package Model;

public class Usuario {
    private final int id;
    private String login;
    private String senha;
    private String nome;
    private boolean administrador;

    public Usuario(int id, String login, String senha, String nome, boolean ehAdministrador) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.administrador = ehAdministrador;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean ehAdministrador() {
        return administrador;
    }
}
