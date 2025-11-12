package AC2_Estudo;

public class Pedido {
    private Cliente cliente;
    private ItemPedido item;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        item = new ItemPedido(produto, quantidade);
    }

    public ItemPedido getItem() {
        return item;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarPedido(){
        System.out.println("""
                           =============
                           Dados do cliente: 
                           Nome: """ + cliente.getNome() 
                + "\nDados do produto: " 
                + "\nNome produto: " + item.getProduto().getNome()
                + "\nPreço: " + item.getProduto().getPreco()
                + "\nQuantidade: " + item.getQuantidade()
                + "\nValor total: " + item.getQuantidade()*item.getProduto().getPreco()
                + "\n============");
    }
}
