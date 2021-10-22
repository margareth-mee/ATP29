package models;

public class Produto extends BaseId{
    public String nome;
    public double preco;
    public Categoria categoria;

    public Produto(){
        this.categoria = new Categoria();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNome: %s \nPreço: %.2f", this.nome, this.preco) + this.categoria.toString();
    }
}