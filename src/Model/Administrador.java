package Model;

public class Administrador extends Usuario {

    public Administrador(int id, String login, String senha, String nome) {
        super(id, login, senha, nome, true);
    }
}
