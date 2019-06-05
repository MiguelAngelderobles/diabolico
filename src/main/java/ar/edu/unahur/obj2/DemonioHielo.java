package ar.edu.unahur.obj2;

import java.util.stream.Stream;

public class DemonioHielo extends Demonio{


    @Override
    public boolean poderAtacar(Alma alma) {
        return alma.isFriolenta();
    }
    public void atormentar(Alma alma){
        alma.setFriolenta(true);
    }
}
