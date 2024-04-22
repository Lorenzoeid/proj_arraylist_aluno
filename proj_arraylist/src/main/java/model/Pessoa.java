package model;


public class Pessoa {
    private String nome;
    private int idade,id;
    
    public Pessoa(){
        this("",0,0);
    }
    public Pessoa(String nome, int idade, int id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return "\n ID: " + this.getId()
+ "\n Nome: " + this.getNome()
+ "\n Idade: " + this.getIdade()
                +"\n -----------";
    }
}
