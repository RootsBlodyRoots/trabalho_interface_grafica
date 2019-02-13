
package trabalhointerface;

import javax.swing.JFrame;


public class TrabalhoInterface {

    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Painel De Cadastro");
       TelaCadastro painelCadastro = new TelaCadastro();
       
       frame.setSize(500, 600);
       frame.add(painelCadastro);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       frame.setVisible(true);
        
        
    }
    
}
