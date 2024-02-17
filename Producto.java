
public class Producto {
    private int codigo;
    private String nombreproducto;
    private TipoProducto tipoProducto; //enum
    private String fecha;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;

    public Producto(
            int codigo, String nombreproducto, TipoProducto tipoProducto,
            String fecha, String fabricante, int cantidadInventario, double precioUnitario) {
        this.codigo = codigo;
        this.nombreproducto = nombreproducto;
        this.tipoProducto = tipoProducto;
        this.fecha = fecha;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

}
