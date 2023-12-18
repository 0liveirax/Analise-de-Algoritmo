package recurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;


public class estoque {
        
    public List<String> produtos = new ArrayList();
    public List<Integer> indice = new ArrayList();   
    public int ASCII;
    
                    
    public void adicionar(){
        for(int i=0 ; i<10 ; i++){
            String nomeProduto = JOptionPane.showInputDialog("Insira um produto: ");         
            produtos.add(nomeProduto);
            indice.add(produtos.size()-1);            
        }                     
         Collections.sort(produtos);
         JOptionPane.showMessageDialog(null, produtos);
    }
    
    public int buscarOtimizado(String nome){
        int indiceProximo = index(nome);
        
        int inicio = indiceProximo > 0 ? indice.get(indiceProximo - 1): 0;
        int fim = Math.min(produtos.size()-1, indice.get(indiceProximo));
        
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            int comparacao = produtos.get(meio).compareTo(nome);

            if (comparacao == 0) {
                JOptionPane.showMessageDialog(null,nome);
                break;
            } else if (comparacao < 0) {
                inicio = meio + 1; 
            } else {
                fim = meio - 1; 
            }
        }
        
        return -1;
        
    }
    
    public int index(String nome){        
        for(int i=0 ; i<produtos.size()-1 ; i++){
            if(produtos.get(indice.get(i)).compareTo(nome) >= 0){
               return i; 
            }
        }
        return indice.size();
    }
    
    public void buscar(String nome){
        ASCII = nome.charAt(0);
        
        if(ASCII <= 77){
            for(int i=0; i<3 ; i++){
                if(produtos.get(i).equals(nome)){
                    JOptionPane.showMessageDialog(null, produtos.get(i));
                    break;
                }
            }
        }else{
            for(int i=3; i>0 ; i--){
                if(produtos.get(i).equals(nome)){
                    JOptionPane.showMessageDialog(null, produtos.get(i));
                    break;
                }            
            }
        }        
    }      
    
}
