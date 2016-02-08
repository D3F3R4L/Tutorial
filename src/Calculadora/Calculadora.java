/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Notebook
 */
public class Calculadora {
    public static void main(String[] args) {
        calculadora calculadora=new calculadora();
        calculadora.calcular();
    }
}
class calculadora{
    void calcular(){
        Object resposta;
        String[] opcoes = {"Adição","Subtração","Multiplicação","Divisão","Exponenciação","Mod"};
        resposta = JOptionPane.showInputDialog(null,"Qual operação deseja fazer?","Escolha",JOptionPane.QUESTION_MESSAGE,null,opcoes,null);
        double a = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro valor?"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Qual o segundo valor?"));
        if (resposta=="Adição")
            JOptionPane.showMessageDialog(null,"Resultado da adição = "+(a+b));
        if (resposta=="Subtração")
            JOptionPane.showMessageDialog(null,"Resultado da subtração = "+(a-b));
        if (resposta=="Multiplicação")
            JOptionPane.showMessageDialog(null,"Resultado da Multiplicação = "+(a*b));
        if (resposta=="Divisão")
            JOptionPane.showMessageDialog(null,"Resultado da Divisão = "+(a/b));
        if (resposta=="Exponenciação")
            JOptionPane.showMessageDialog(null,"Resultado da Exponenciação = "+ Math.pow(a,b));
        if (resposta=="Mod")
            JOptionPane.showMessageDialog(null,"Resto da Divisão = "+(a%b));
    }
}
