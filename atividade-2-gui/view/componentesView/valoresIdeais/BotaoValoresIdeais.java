package componentesView.valoresIdeais;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JTextField;

import componentesView.PaginaPrincipal;

public class BotaoValoresIdeais implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> lista = new ArrayList<JTextField>();
    
    public void ApagaBotoes(PaginaPrincipal pg){
        this.pg = pg;
        this.lista = pg.getTextFieldsComInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("");
        }        
    }
    
    public void PreencheBotoes(PaginaPrincipal pg) {
        this.pg = pg;
        this.lista = pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("Botão funcionou");
        } 	
    }
}
