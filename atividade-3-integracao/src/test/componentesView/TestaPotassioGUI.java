package test.componentesView;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import view.PaginaPrincipal;

class TestaPotassioGUI {
	
	PaginaPrincipal pg;
	
	@BeforeEach
	void setPaginaPrincipal() {
		pg = new PaginaPrincipal();
	}

	@Test
	void testaValoresIdeaisTextFieldComInputUsuario() {
		
	    List<JTextField> lista = new ArrayList<JTextField>();
	    lista = pg.getTextFieldComInputUsuarioGuiaPotassio();
	    
        for (int i = 0; i < lista.size(); i++) {
        	JTextField texto = pg.getTextField(lista.get(i));
            texto.setText("teste fosforo");
        }  
        
        pg.btnCalcular_2.doClick();
        
        for (int i = 0; i < lista.size(); i++) {
        	assertEquals("", pg.getTextField(lista.get(i)).getText());
        }      

	}
	
	@Test
	void testaValoresIdeaisTextFieldSemInputUsuario() {
	    List<JTextField> lista = new ArrayList<JTextField>();
        
        pg.btnCalcular_2.doClick();
        
	    lista = pg.getTextFieldSemInputUsuarioGuiaPotassio();
        
        for (int i = 0; i < lista.size(); i++) {
        	assertEquals("Botão funcionou, guia Potássio!", pg.getTextField(lista.get(i)).getText());
        }   
	}

}
