/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String n, int i) throws IdadeInvalidaException {
        this.setNome(n);
        this.setIdade(i);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) throws IdadeInvalidaException{
        if(i<0){
            throw new IdadeInvalidaException("Idade invalida");
        
        }
        
        this.idade = i;
    }
}
