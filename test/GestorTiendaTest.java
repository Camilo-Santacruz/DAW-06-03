import org.junit.Test;
import static org.junit.Assert.*;

public class GestorTiendaTest {

    @Test
    public void testCalcularDescuento() {
        GestorTienda gestor = new GestorTienda();

        
        assertEquals(10.0, gestor.calcularDescuento(100.0, 10), 0.001);

        
        assertEquals(5.0, gestor.calcularDescuento(100.0, 5), 0.001);

        
        assertEquals(0.0, gestor.calcularDescuento(100.0, 4), 0.001);
    }

    @Test
    public void testCategorizarProducto() {
        GestorTienda gestor = new GestorTienda();

        
        assertEquals("Económico", gestor.categorizarProducto(9.99));

       
        assertEquals("Estándar", gestor.categorizarProducto(25.0));

        
        assertEquals("Premium", gestor.categorizarProducto(50.0));
    }

    @Test
    public void testBuscarProducto() {
        GestorTienda gestor = new GestorTienda();
        String[] inventario = {"Manzana", "Banana", "Pera", "Naranja"};

        
        assertEquals("Manzana", gestor.buscarProducto(inventario, "manzana"));

        
        assertNull(gestor.buscarProducto(inventario, "Uva"));
    }
}
