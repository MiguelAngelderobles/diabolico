package ar.edu.unahur.obj2;

public class Diablo {
    public boolean SteMenAtaca(Demonio demonio,Alma alma){
        return demonio.poderAtacar(alma);
    }
    public void AtormentameAsteMen(Demonio demonio,Alma alma){
        demonio.atormentar(alma);
    }
    public void PoneteACazar(Demonio demonio, Lugar lugar){
        demonio.CazarAlmas(lugar);
    }
    public void Ataca(){}
    public void entrenar(Alma alma){

    }

}
