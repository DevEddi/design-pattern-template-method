public class LeiteIntegral  extends Leite{
    public String verificaLeite(){
        if((this.pesoTotal() > 1030) && (this.pesoTotal() < 1060)){
            return "Ok";
        }else{
            return "Retorna produção";
        }
    }
}
