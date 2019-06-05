package ar.edu.unahur.obj2;

public class AlmaEntrenadaValor extends Alma{
    private Alma alma;
    public AlmaEntrenadaValor(Alma alma){
        this.alma=alma;
    }

    public void cruzRoja(){
        this.setBondad(100);
    }
}
