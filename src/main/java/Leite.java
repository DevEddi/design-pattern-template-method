public abstract class Leite {
    private int codigoDeBarra;
    private String marcaLeite;
    private String tipo;
    private int quantidade;
    private float valor;

    public Leite(int codigoDeBarra, String marcaLeite, String tipo, int quantidade, float valor) {
        this.codigoDeBarra = codigoDeBarra;
        this.marcaLeite = marcaLeite;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getMarcaLeite() {
        return marcaLeite;
    }

    public void setMarcaLeite(String marcaLeite) {
        this.marcaLeite = marcaLeite;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float calculaDesconto(){
        return
    }

    public abstract String verificaLeite();

    public String getTipoNutricional(){
        return "Leite";
    }
    public String getInfoNutricional(){
        return getTipoNutricional() + "{" +
                "Codigo de Barra = " + this.codigoDeBarra +
                ", Marca do Leite = '" + this.marcaLeite + '\''+
                ", tipo = " + this.comparaTipo() +
                '}';
    }
}
