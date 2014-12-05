package Model;

public class Vendedor extends Usuario {

    public Vendedor(int id, String login, String senha, String nome) {
        super(id, login, senha, nome, false);
    }
}