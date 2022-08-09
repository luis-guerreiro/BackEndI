package Aula9_IntegradoraIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho(){
        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);
        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        assertEquals(triangulo.getCor(),"vermelho");
        assertEquals(triangulo1.getTamanho(),4);
        assertEquals(FlyweightFactory.trianguloMap.size()==1,true);


    }
}
