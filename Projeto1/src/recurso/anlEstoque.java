package recurso;

import javax.swing.JOptionPane;

// Autor: Guilherme de Oliveira

public class anlEstoque {

  
    public static void main(String[] args) {
        estoque gerenciar = new estoque();
        String nome = new String();
        int result;
        
        gerenciar.adicionar();
        
        nome = JOptionPane.showInputDialog("Qual Produto deseja Buscar? ");
        
        result = gerenciar.buscarOtimizado(nome);
        
        if(result == -1){
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
    }   
    
}
