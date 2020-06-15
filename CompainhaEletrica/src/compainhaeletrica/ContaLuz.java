
package compainhaeletrica;

public class ContaLuz {
    public int leituraAtual;
    public int leituraAnterior;
    public double tusd = 0.30;
    public double te = 0.29;
    public String bandeira;
    public int diferenca;
    public double cobranca;
    public double adicional;
    public double Total;
    
    
    public double total_conta(double cobranca, double adicional){
        this.Total= this.cobranca+ this.adicional;
         setTotal(this.Total);
        return this.Total;
    }
    
     public String verificar_cor(int diferenca){        
        if(this.diferenca <= 100){
            this.bandeira= "Bandeira verde";
            
        }
        else if(this.diferenca >100 && this.diferenca <= 150){
            this.bandeira= "Bandeira amarela";
        }
        else if(this.diferenca >150 && this.diferenca <= 200){
            this.bandeira= "Bandeira vermelha primeiro patamar";
        }   
        else{
            this.bandeira= "Bandeira vermelha segundo patamar";
        }
        setBandeira(this.bandeira);
        return this.bandeira;
     }
    
    public double verificar_bandeira(int diferenca){
        double soma;
        if(this.diferenca <= 100){
            soma= this.diferenca* 0;
            this.adicional=soma+(soma*25)/100;
            
        }
       else if(this.diferenca >100 && this.diferenca <= 150){
           soma= this.diferenca* 0.013;
           this.adicional=soma+(soma*25)/100;
        }
       else if(this.diferenca >150 && this.diferenca <= 200){
          soma= this.diferenca* 0.042; 
          this.adicional=soma+(soma*25)/100;
         }
         
        else{
           soma= this.diferenca* 0.062;
           this.adicional=soma+(soma*25)/100;
        }   
        setAdicional(this.adicional);
        return this.adicional;
        }
    
    public double cobranca(int diferenca,double tusd,double te ){
        double soma= (this.diferenca* this.tusd)+ (this.diferenca* this.te);
        this.cobranca= soma+ (soma*25)/100;
        setCobranca(this.cobranca);
        return this.cobranca;
        
    }
    
    public int subtracao(int leituraAtual, int leituraAnterior){
        this.diferenca = this.leituraAtual- this.leituraAnterior;
        setDiferenca(this.diferenca);
        return this.diferenca;
    }
    
    
    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
        public double getCobranca() {
        return cobranca;
    }

    public void setCobranca(double cobranca) {
        this.cobranca = cobranca;
    }
    
     public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
     
    public String getBandeira() {
        return bandeira;
    }

      public int getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(int diferenca) {
        this.diferenca = diferenca;
    }
  
    
    
    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }
   
}