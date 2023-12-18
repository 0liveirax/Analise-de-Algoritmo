package Brasileirao;

import java.util.List;
import javax.swing.JOptionPane;

public class Time {
    
    private String nome;
    private int pontos;
    StringBuilder resultado = new StringBuilder();
    StringBuilder resultado1 = new StringBuilder();
    StringBuilder resultado2 = new StringBuilder();
    StringBuilder resultado3 = new StringBuilder();
    StringBuilder resultado4 = new StringBuilder();

    public Time(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }
    
    public void tabelaTimes(List<Time> time){
        Time resultados;       
        
        for(int i = 0 ; i<time.size() ; i++){
            resultados = time.get(i);
            resultado.append("Time: ")
                     .append(resultados.getNome())
                     .append("; Pontos ")
                     .append(resultados.getPontos())
                     .append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void CincoPrimeiros(List<Time> time, int indice){
        Time resultados;
       
        if(indice < Math.min(time.size(), 5)){
            resultados = time.get(indice);
            resultado1.append("Posição: ")
                     .append(indice+1)
                     .append("; Time: ")
                     .append(resultados.getNome())
                     .append("; Pontos ")
                     .append(resultados.getPontos())
                     .append("\n");
                        
            CincoPrimeiros(time, indice+1);            
        }else{
           JOptionPane.showMessageDialog(null, resultado1); 
        }
         
    }
    
    public void CincoUltimos(List<Time> time, int indice) {
        Time resultados;
        if (time.size() > indice) {
            resultados = time.get(indice);
            resultado2.append("Posição: ")
                .append(indice + 1)
                .append("; Time: ")
                .append(resultados.getNome())
                .append("; Pontos ")
                .append(resultados.getPontos())
                .append("\n");

             CincoUltimos(time, indice+1); 
        }else{
            JOptionPane.showMessageDialog(null, resultado2);
        }    
    }
    
    public void DiferencaPontos(List<Time> time, int inicio, int fim){
        Time resultados;
        if(inicio == 0){
            for(int i = inicio ; i<fim ; i++){
                for(int j = i + 1 ; j<fim ; j++){
                    Time TimeA = time.get(i);
                    Time TimeB = time.get(j);

                    int diferenca = TimeA.getPontos() - TimeB.getPontos();
                    resultado3                
                    .append(TimeA.getNome())
                    .append(" x ")
                    .append(TimeB.getNome())
                    .append(" Diferença: ")
                    .append(diferenca)
                    .append("\n");
                }            
            } 
            JOptionPane.showMessageDialog(null, resultado3);
        }else{
            for(int i = inicio ; i<fim ; i++){
                for(int j = i + 1 ; j<fim ; j++){
                    Time TimeA = time.get(i);
                    Time TimeB = time.get(j);
                
                    int diferenca = TimeA.getPontos() - TimeB.getPontos();
                    resultado4                
                    .append(TimeA.getNome())
                    .append(" x ")
                    .append(TimeB.getNome())
                    .append(" Diferença: ")
                    .append(diferenca)
                    .append("\n");
                }            
            }
            JOptionPane.showMessageDialog(null, resultado4);
        }                        
    }
    
    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }
}
