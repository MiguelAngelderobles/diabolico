package ar.edu.unahur.obj2;

public class AlmaLuchador extends Alma {
    private Alma alma;
    public AlmaLuchador(Alma alma){
        this.alma=alma;
    }
    public int luchaMarcialDemoniaca(){
        return alma.getValor()*2;
    }
}
