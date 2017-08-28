import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteDeValidacao {


    @Test
    public void  Exercicio01(){
        Complexo C = new Complexo(4,4);
        C.subtracao(new Complexo(3,3));
        assertEquals("(1,1)",C.toString());
        C.soma(new Complexo(2,4));
        assertEquals("(3,5)",C.toString());
        C.soma(new Complexo(7,3));
        assertEquals("(10,8)", C.toString());
        C.subtracao(new Complexo(4,6));
        assertEquals("(6,2)", C.toString());
    }

}
