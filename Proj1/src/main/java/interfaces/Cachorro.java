/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package interfaces;

/**
 *
 * @author Felipe Bispo
 */
public class Cachorro {

    private String nome;
    private String raca;
    private char sexo;
    private String cor;
    private int idade;


    public Cachorro(String nome, String raca, char sexo, String cor, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
        this.idade = idade;
     
    }

    public Cachorro() {


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raça: " + this.raca);
    }

    void latir(){
        if(idade > 10)
            System.out.println("Wooof, Wooof!");
        else if(idade > 5)
            System.out.println("Ruff!, Ruff!");
        else
            System.out.println("Au!, au!");
    }

    public String dormir(){
        return("O cachorro dormiu");
    }

    public String acordar(){
        return("O cachorro acordou");
    }

    public String comer(){
        return("O cachorro comeu");
    }
}

