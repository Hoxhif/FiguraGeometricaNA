import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaTest {
    int a=2;
    int b=2;
    // comentario


@Test
    public void testNombreEsCuadrado(){
    if (a==b)
        assertEquals(true,"cuadrado");
}

@Test
    public void testNombreEsRectangulo(){
        if (a!=b)
    assertEquals(true,"rectangulo");
}
}