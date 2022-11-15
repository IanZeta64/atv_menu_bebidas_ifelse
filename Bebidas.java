public enum Bebidas {
    COCA_COLA(1, 5.00, "Coca-Cola"), COCA_COLA_ZERO(2, 4.50, "Coca-Cola Zero")
    , PEPSI(3, 4.40, "Pepsi"), GUARANA_ANTARTICA(4, 3.50, "Guaraná Antarctica")
    , FANTA_LARANJA(5, 4.23, "Fanta Laranja"), AGUA(6, 2.50, "Água");
    private final Integer codigo;
    private final Double preco;
    private final String nome;
    Bebidas(Integer codigo, Double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public Double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}
