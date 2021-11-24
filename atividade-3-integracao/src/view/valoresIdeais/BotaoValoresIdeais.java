package view.valoresIdeais;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JTextField;

import view.PaginaPrincipal;

public class BotaoValoresIdeais implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> listaTextFieldsComInputUsuárioGuiaValoresIdeais = new ArrayList<JTextField>();
    List<JTextField> listaextFieldsSemInputUsuárioGuiaValoresIdeais = new ArrayList<JTextField>();
    
    public void ApagaBotoes(PaginaPrincipal pg){
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaValoresIdeais = pg.getTextFieldsComInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < listaTextFieldsComInputUsuárioGuiaValoresIdeais.size(); i++) {
        	this.texto = pg.getTextField(listaTextFieldsComInputUsuárioGuiaValoresIdeais.get(i));
        texto.setText("");
        }        
    }
    
   /* public void PreencheBotoes(PaginaPrincipal pg) {
        this.pg = pg;
        this.lista = pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("Botão funcionou, guia Valores Ideais!");
        } 	
    }*/
    
    public void CalculaIdeal(PaginaPrincipal pg) {
        this.pg = pg;
        this.listaTextFieldsComInputUsuárioGuiaValoresIdeais = pg.getTextFieldsComInputUsuárioGuiaValoresIdeais();
        this.listaextFieldsSemInputUsuárioGuiaValoresIdeais = pg.getTextFieldsSemInputUsuárioGuiaValoresIdeais();
        
    }
}
