

public class Producto {
    // atributos
    private String nombre;
    private double precio;
    private int stock;

    public void aplicarDescuento (double descuento) {
        precio = precio - (precio * (descuento)/100);
    }
    public void imprimirTicket (){
        String ticked = """
                Ticked
                ------------
                Producto: %s
                precio: %f
                Stack: %d
                ------------
                """;

        String Im_tikced = ticked.formatted(nombre,precio,stock);
        System.out.print(Im_tikced);
    }
    public static void main (String[] args){
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        p1.precio = 50 ;
        p1.nombre = "lapiz";
        p1.stock = 1;

        p2.precio = 100;
        p2.nombre = "perro";
        p2.stock = 2;

        p1.imprimirTicket();
        p2.imprimirTicket();

        p1.aplicarDescuento(50);
        p1.stock = 0;

        p1.imprimirTicket();
        p2.imprimirTicket();

    }
}
