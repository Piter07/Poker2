public class Carta {
    public String valor;
    public String palo;
    public int valorNum;
    public Carta()
    {

    }

    public Carta(String completo)
    {
        this.valor = String.valueOf(completo.charAt(0));
        this.palo = String.valueOf(completo.charAt(1));
        if(this.valor.equals("A")) {
            this.valorNum = 1;
        }else if(this.valor.equals("T")) {
            this.valorNum = 10;
        }else if(this.valor.equals("J")) {
            this.valorNum = 11;
        }else if(this.valor.equals("K")) {
            this.valorNum = 12;
        }else if(this.valor.equals("Q")) {
            this.valorNum = 13;
        }else{
            this.valorNum = Integer.parseInt(this.valor);
        }
    }

    public String valorPalo()
    {
        return this.valor + this.palo ;
    }


}


