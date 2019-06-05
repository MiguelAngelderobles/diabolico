package ar.edu.unahur.obj2;

import java.util.Collection;
import java.util.LinkedHashSet;

public class DemonioFuego extends Demonio {
    @Override
    public boolean poderAtacar(Alma alma) {
        return !alma.isFriolenta();
    }
    public void atormentar(Alma alma){
        alma.setFriolenta(false);
    }

}
