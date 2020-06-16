
package luz;

import javax.swing.JOptionPane;

public class classe {
    String nome;
    String endereco;
    double leitura1;
    double leitura2;
public double taxas(double diferenca){
 
 double T1= diferenca*0.30; 
 double T2= diferenca*0.29;  
 double T= T1+T2;
 double ftaxa= T*1.25;
return ftaxa;

    }
    public String getNome(){
        return nome;
    }
   
    public void setNome(String nome){
    this.nome=nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
    this.endereco=endereco;
    }
   
     public double getLeitura1(){
        return leitura1;
    }
    public void setLeitura1(double leitura1){
    this.leitura1=leitura1;
    }
      public double getLeitura2(){
        return leitura2;
    }
    public void setLeitura2(double leitura2){
    this.leitura2=leitura2;
    }
    public double fazerLeitura(double leitura1, double leitura2){
   double diferenca= leitura2-leitura1;
    
    return diferenca;
    }
     
   
      public void bandeira(double diferenca,double ftaxa){
      double total;
        if (diferenca<=100){
      total=ftaxa; 
       JOptionPane.showMessageDialog(null,"Nome:"+nome
               +"\n Endereço: "+endereco+
               "\n Consumo: "+diferenca
                +"\n Valor sem bandeira: R$"+ftaxa
               +"\n Valor: R$"+total
               +"\n Bandeira verde");
      }
        else if(diferenca>=101 && diferenca<=150){
        total= ((diferenca*0.013)*1.25)+ftaxa;
          JOptionPane.showMessageDialog(null,"Nome:"+nome
               +"\n Endereço: "+endereco+
               "\n Consumo: "+diferenca
                +"\n Valor sem bandeira: R$"+ftaxa
               +"\n Valor: R$"+total
             +"\n Bandeira amarela");
        
        }
    else if (diferenca>=151 && diferenca<=200){
        total= ((diferenca*0.042)*1.25)+ftaxa;
             JOptionPane.showMessageDialog(null,"Nome do proprietário:"+nome
               +"\n Endereço: "+endereco+
               "\n Consumo: "+diferenca
                +"\n Valor sem bandeira: R$"+ftaxa
               +"\n Valor: R$"+total
                +"\n Bandeira vermelha 1");
        
        }
        else {
        total= ((diferenca*0.062)*1.25)+ftaxa;
             JOptionPane.showMessageDialog(null,"Nome do proprietário:"+nome
               +"\n Endereço: "+endereco+
               "\n Consumo: "+diferenca+" kw/h"
                +"\n Valor sem bandeira: R$"+ftaxa
               +"\n Valor: R$"+total
                +"\n Bandeira vermelha 2");
        
        }
   
      }
}
