public abstract class Leite{

    private int codigoDeBarra;
    protected String marcaLeite;
    private float pesoLeite;
    private float pesoCaixaDoLeite;

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

    public float getPesoLeite() {
        return pesoLeite;
    }

    public void setPesoLeite(float pesoLeite) {
        this.pesoLeite = pesoLeite;
    }
    public float getPesoCaixaDoLeite() {
        return pesoCaixaDoLeite;
    }

    public void setPesoCaixaDoLeite(float pesoCaixaDoLeite) {
        this.pesoCaixaDoLeite = pesoCaixaDoLeite;
    }

    public float pesoTotal(){
        return (this.pesoLeite * 1000) + this.pesoCaixaDoLeite;
    }

    public abstract String verificaLeite();

    public String getTipo(){
        return "Leite Integral";
    }


    public String getInfoCaixa(){
        return getTipo() + "{" +
                " Codigo de Barra = " + this.codigoDeBarra +
                ", Marca do Leite = '" + this.marcaLeite + '\''+
                ", estado = " + this.verificaLeite() +
                '}';
    }
}
