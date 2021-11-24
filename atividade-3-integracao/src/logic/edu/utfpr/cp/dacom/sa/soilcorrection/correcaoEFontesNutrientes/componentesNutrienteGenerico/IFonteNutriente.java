package logic.edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFontesNutrientes.componentesNutrienteGenerico;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
