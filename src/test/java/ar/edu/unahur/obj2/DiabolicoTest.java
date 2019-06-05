package ar.edu.unahur.obj2;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiabolicoTest {

    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void test(){
        Alma alma1=new Alma();
        Alma alma2=new Alma();
        Alma alma3=new Alma();

        alma1.setValor(100);
        alma1.setFriolenta(true);
        alma1.setBondad(100);

        alma2.setValor(30);
        alma2.setFriolenta(false);
        alma2.setBondad(40);

        alma3.setValor(500);
        alma3.setFriolenta(true);
        alma3.setBondad(400);

        Demonio demonioFuego=new DemonioFuego();
        demonioFuego.setNivelDeMaldad(5000);
        Diablo diablo=new Diablo();

        Lugar septimoCirculo=new Lugar();

        septimoCirculo.setConjALmas(alma1);
        septimoCirculo.setConjALmas(alma2);
        septimoCirculo.setConjALmas(alma3);


        demonioFuego.CazarAlmas(septimoCirculo);
        demonioFuego.poderAtacar(alma1);
        demonioFuego.poderAtacar(alma2);
        demonioFuego.poderAtacar(alma3);
        Assert.assertEquals(demonioFuego.poderAtacar(alma1),true);
        Assert.assertEquals(demonioFuego.almasAtormentadas,2);
        diablo.SteMenAtaca(demonioFuego,alma1);
        Assert.assertEquals(diablo.SteMenAtaca(demonioFuego,alma1),true);

    }

    @Test
    public void test1(){
        Alma alma=new Alma();
        alma.setFriolenta(true);
    }
}