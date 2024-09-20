package model;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();
    public void colocarDomir(){
        System.out.println(nome + "dormindo....");
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
