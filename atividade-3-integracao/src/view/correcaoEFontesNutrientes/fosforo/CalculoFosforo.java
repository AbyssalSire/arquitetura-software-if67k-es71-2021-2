package view.correcaoEFontesNutrientes.fosforo;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JTextField;

import view.PaginaPrincipal;

public class CalculoFosforo implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> lista = new ArrayList<JTextField>();
    
    public void ApagaBotoes(PaginaPrincipal pg){
        this.pg = pg;
        this.lista = pg.getTextFieldComInputUsuarioGuiaFosforo();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("");
        }        
    }
    
    public void PreencheBotoes(PaginaPrincipal pg) {
        this.pg = pg;
        this.lista = pg.getTextFieldSemInputUsuarioGuiaFosforo();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("Botão funcionou, guia Fósforo!");
        } 	
    }
}
