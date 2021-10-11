public class LeiteSoja  extends Leite{
    public String verificaLeite(){
        if((this.pesoTotal() > 1050) && (this.pesoTotal() < 1090)){
            return "Ok";
        }else{
            return "Retorna produção";
        }
    }
    @Override
    public String getTipo(){
        return "Leite de Soja";
    }
}
