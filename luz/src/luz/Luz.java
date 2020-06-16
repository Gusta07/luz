package luz;

import javax.swing.JOptionPane;

public class Luz {

    public static void main(String[] args) {
        classe dados= new classe();
       dados.setNome((JOptionPane.showInputDialog("Digite o nome do proprietário: ")));
        dados.setEndereco((JOptionPane.showInputDialog("Digite o endereço: ")));
      dados.setLeitura1(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura anterior: ")));
    dados.setLeitura1(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atual: "))); 
   
    double leitura= dados.fazerLeitura(dados.getLeitura1(),dados.getLeitura2());
    double taxas=dados.taxas(leitura);
    dados.bandeira(leitura, taxas);
    }
}
