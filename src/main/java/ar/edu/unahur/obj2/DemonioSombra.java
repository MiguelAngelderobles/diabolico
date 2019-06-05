package ar.edu.unahur.obj2;

public class DemonioSombra extends Demonio{

    @Override
    public boolean poderAtacar(Alma alma) {
        return  alma.getValor()>50;
    }
    public void atormenta(Alma alma){
        alma.setValor(alma.getValor()/2);
    }
}
