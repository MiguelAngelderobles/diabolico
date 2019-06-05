package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private int NivelDeMaldad;
    private List<Alma> almaCasada=new ArrayList<>();
    public int almasAtormentadas;
    public int getNivelDeMaldad() {
        return NivelDeMaldad;
    }

    public void setNivelDeMaldad(int nivelDeMaldad) {
        NivelDeMaldad = nivelDeMaldad;
    }

    public abstract boolean poderAtacar(Alma alma);

    public void CazarAlmas(Lugar lugarAtacado) {

        lugarAtacado.getConjALmas()
                .stream()
                .forEach(c-> {
                    if ((c.getBondad() < this.getNivelDeMaldad()) && (this.poderAtacar(c))){
                            lugarAtacado.getConjALmas().remove(c);

                            almaCasada.add(c);

                        almasAtormentadas+=lugarAtacado.getConjALmas().size();

                    }else {
                        c.estoyAtormentada(this);
                        //this.atormentar(c);
                    };
                });



    }

    public int nuevoNivelDeMaldad(){
        return this.getNivelDeMaldad()+almaCasada.size()+almasAtormentadas;
    }
    public void atormentar(Alma alma){}

}