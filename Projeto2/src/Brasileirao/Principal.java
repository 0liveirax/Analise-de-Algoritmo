package Brasileirao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

// Autor: Guilherme de Oliveira
public class Principal {
   
    public static void main(String[] args) {
        List<Time> tabela = new ArrayList<>();
        Time time = new Time(null,0);
        tabela.add(new Time("Palmeiras", 63));
        tabela.add(new Time("Flamengo", 63));
        tabela.add(new Time("Botafogo", 62));
        tabela.add(new Time("Atlético-MG", 60));
        tabela.add(new Time("Grêmio", 59));
        tabela.add(new Time("Bragantino", 59));
        tabela.add(new Time("Fluminense", 53));
        tabela.add(new Time("Atlético-PR", 52));
        tabela.add(new Time("Cuiabá", 48));
        tabela.add(new Time("São Paulo", 47));
               
        //Exibe tabelas com seus respectivos pontos
        time.tabelaTimes(tabela);
        
        //Exibe os cincos melhores da Tabela
        time.CincoPrimeiros(tabela,0);
        
        //Exibe os cincos piores da Tabela
        int indice = tabela.size()-5;
        time.CincoUltimos(tabela, indice);
        
        //Exibe a diferença dos Cincos Primeiros
        time.DiferencaPontos(tabela, 0, 5);
        
        time.DiferencaPontos(tabela, tabela.size() - 5, tabela.size());

        // Algoritmo 6: Reordenar a tabela para exibir apenas metade dos times com base na quantidade de pontos
        System.out.println("\nMetade dos Times com base na quantidade de pontos:");
        reordenarETamanhoMetade(tabela);
        exibirTabela(tabela);
    }
           
            
    
    public static void reordenarETamanhoMetade(List<Time> times) {
        Collections.sort(times, (t1, t2) -> Integer.compare(t2.getPontos(), t1.getPontos()));
        int newSize = times.size() / 2;
        times.subList(newSize, times.size()).clear();
    }
    
    public static void exibirTabela(List<Time> times) {
        for (int i = 0; i < times.size(); i++) {
            Time time = times.get(i);
            System.out.println("Posição: " + (i + 1) + ", Time: " + time.getNome() + ", Pontuação: " + time.getPontos());
        }
    }
}


