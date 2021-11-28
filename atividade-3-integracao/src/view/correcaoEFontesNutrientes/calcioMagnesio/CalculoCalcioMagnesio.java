package view.correcaoEFontesNutrientes.calcioMagnesio;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JTextField;

import view.PaginaPrincipal;

public class CalculoCalcioMagnesio implements EventListener{
    private PaginaPrincipal pg;
    private JTextField texto;
    List<JTextField> lista = new ArrayList<JTextField>();
    
    public void ApagaBotoes(PaginaPrincipal pg){
        this.pg = pg;
        this.lista = pg.getTextFieldComInputUsuarioGuiaCalcioMagnesio();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("");
        }        
    }
    
    public void PreencheBotoes(PaginaPrincipal pg) {
        this.pg = pg;
        this.lista = pg.getTextFieldSemInputUsuarioGuiaCalcioMagnesio();
        for (int i = 0; i < lista.size(); i++) {
        	this.texto = pg.getTextField(lista.get(i));
        texto.setText("Botão funcionou, guia Cálcio e Magnésio!");
        } 	
    }
}
