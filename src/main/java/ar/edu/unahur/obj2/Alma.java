package ar.edu.unahur.obj2;

public class Alma  {
    private int bondad;
    private int valor;
    private boolean friolenta;
    private Demonio demonioQueMeLastima;

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isFriolenta() {
        return friolenta;
    }

    public void setFriolenta(boolean friolenta) {
        this.friolenta = friolenta;
    }



    public boolean estoyCazada(){
        return true;
    }

    public void estoyJodida(){

    }

    public void estoyAtormentada(Demonio demonio) {
        this.bondad-=5;
        demonio.atormentar(this);

    }


}


