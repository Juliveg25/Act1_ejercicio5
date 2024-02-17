import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private static String nombre;
    private static String direccion;
    private static int telefono;
    private List<Producto> productos;

    public Tienda(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
        almacenarProducto();
    }

    private void almacenarProducto() {
        productos.add(new Producto(1, "Leche", TipoProducto.LACTEO, "12/02/2026", "Klim", 20, 5000));
        productos.add(new Producto(2, "Carne", TipoProducto.CARNICO, "12/02/2026", "Fabricante1", 10, 15000));
        productos.add(new Producto(3, "Manzana", TipoProducto.FRUTA, "12/02/2026", "Carulla", 100, 3500));
        productos.add(new Producto(4, "Atun", TipoProducto.ENLATADO, "12/02/2026", "VanC", 20, 11000));
    }
}

