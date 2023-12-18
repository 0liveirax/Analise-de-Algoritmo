package projetoCriptografia;

import javax.swing.JOptionPane;

//Autor : Guilherme de Oliveira
public class CriptografiaMain {   
    
    public static int ASCII;
    public static String chaveCrip = new String();
    private static String codDecod = new String();
    
    public static void main(String[] args) {
               
        String chave = new String();
        chave = JOptionPane.showInputDialog("Insira um texto");
        criptografador(chave); 
        descriptografar(chaveCrip);
        
    }
    public static void criptografador(String chave){                               
        char aux ;  
        
        for(int i = 0 ; i <= chave.length()-1 ; i++){
             ASCII = (char) chave.charAt(i)-4 * i;
             aux = (char)ASCII ;             
             chaveCrip += Character.toString(aux);
        }           
        JOptionPane.showMessageDialog(null, chaveCrip);
    }
    
    public static void descriptografar (String chave){
        char c;		

        for (int d = 0; d <= chave.length()-1; d++){	
			
            ASCII = chaveCrip.charAt(d)+4 * d;
            c = (char)ASCII;
            codDecod += Character.toString(c);			
        }
        JOptionPane.showMessageDialog(null,codDecod); 
    }	
    
}
