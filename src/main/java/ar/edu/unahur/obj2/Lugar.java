package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
    private String nombre;
    private List<Alma> ConjAlmas =new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alma> getConjALmas() {
        return ConjAlmas;
    }

    public void setConjALmas(Alma Alma) {
        ConjAlmas.add(Alma);

    }


//    public void SiendoCazados(){
  //      ConjAlmas.stream().forEach(c->c.atacados());
    // }

    public void AlmaCazada(Alma alma){
        ConjAlmas.remove(alma);
    }
}
