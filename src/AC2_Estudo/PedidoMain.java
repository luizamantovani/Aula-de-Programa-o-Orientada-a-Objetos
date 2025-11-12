package AC2_Estudo;

public class PedidoMain {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana Silva");
        Produto p = new Produto("Camiseta", 50);
        Pedido pe = new Pedido(c, p, 100);
        pe.mostrarPedido();
    }
    
}
