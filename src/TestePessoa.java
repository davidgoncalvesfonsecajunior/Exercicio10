/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class TestePessoa {

    public static void main(String[] args) {

        try {
            Pessoa p = new Pessoa("David", -1);
            //caso vc insira uma pessoa com idade invalida
            //o codigo ja pula para o catch
            //o Sout só ira ser executado em caso de inserção correta
            

            System.out.println("nome: " + p.getNome() + " Idade: " + p.getIdade());
        } catch (IdadeInvalidaException ex) {

            System.out.println("ERRO!!!\nIdade Invalida");

        }

    }

}
