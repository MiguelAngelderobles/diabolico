package ar.edu.unahur.obj2;

public class AlmaEntrenadaSupervivencia extends Alma{
    private Alma alma;
    public AlmaEntrenadaSupervivencia(Alma alma){
        this.alma=alma;
    }
    final void supervivenciaExtremaEnElInfierno(){
         this.setFriolenta(false);
    }
}
