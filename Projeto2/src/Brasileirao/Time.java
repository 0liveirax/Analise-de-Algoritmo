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
    StringBuilder resultado5 = new StringBuilder();
    StringBuilder resultado6 = new StringBuilder();
    StringBuilder resultado7 = new StringBuilder();

    
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
    
    public void BubbleSort(List<Time> time){        
        int aux;
        int primeiro;        
        
        for(int i = 0 ; i<time.size() ; i++){ 
            Time resultados = time.get(i);
            for(int j = i + 1 ; j<=time.size()-1 ; j++){
                Time fix = time.get(i);
                Time var = time.get(j);
                if(fix.getPontos() < var.getPontos()){
                    aux = fix.getPontos();
                    primeiro = var.getPontos();
                    fix.setPontos(primeiro);
                    var.setPontos(aux);                                        
                }                
            }
            resultado5.append("Time: ")
                     .append(resultados.getNome())
                     .append("; Pontos ")
                     .append(resultados.getPontos())
                     .append("\n");
            
        }
        JOptionPane.showMessageDialog(null, resultado5);
    }
    int i, j;
    
    
    public void InsertionSort(List<Time> time){
        resultado6.append("INSERTION SORT\n\n");
        for (i = 1; i < time.size(); i++) {
            Time resultados = time.get(i);
            j = i - 1;

            while (j >= 0 && time.get(j).getPontos() < resultados.getPontos()) {
                time.set(j + 1, time.get(j));
             j--;
        }

        time.set(j + 1, resultados);
    }

    for (Time t : time) {
        resultado6
                .append("Time: ")
                .append(t.getNome())
                .append("; Pontos ")
                .append(t.getPontos())
                .append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado6);
    }
    
    public void SelectionSort(List<Time> time){
        resultado7.append("SelectionSort\n\n");
        int menor = 0;
        int menoraux = 0;
        for(int i = 0 ; i < time.size() ; i ++){
            Time resultados = time.get(i);
            for(j = i + 1 ; j < time.size() ; j ++){
               if(time.get(i).getPontos() > time.get(j).getPontos()){
                   menor = time.get(j).getPontos();
               }
            }
            resultados.setPontos(menor);
            resultado7
                .append("Time: ")
                .append(resultados.getNome())
                .append("; Pontos ")
                .append(resultados.getPontos())
                .append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado7);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    

    private boolean getPontos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
