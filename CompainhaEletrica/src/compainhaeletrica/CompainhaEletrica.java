
package compainhaeletrica;

import javax.swing.JOptionPane;

public class CompainhaEletrica {

    public static void main(String[] args) {
        ContaLuz dados = new ContaLuz();
        dados.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Leitura anterior:")));
        dados.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Leitura atual:")));
        
         
        dados.subtracao(dados.getLeituraAtual(), dados.getLeituraAnterior());
        dados.cobranca(dados.getDiferenca(), dados.getTusd(), dados.getTe());
        dados.verificar_bandeira(dados.getDiferenca());
        dados.verificar_cor(dados.getDiferenca());
        dados.total_conta(dados.getCobranca(), dados.getAdicional());
        
        JOptionPane.showMessageDialog(null,">>>>>>>>>>> CONTA DE LUZ <<<<<<<<<<<\n\n"
        + "Consumo anterior: "
        + dados.getLeituraAnterior()
        +"Kw\n Consumo atual: "
        + dados.getLeituraAtual()
        + "Kw\n Consumo: "
        + dados.getDiferenca()
        + "Kw\n Bandeira: "
        + dados.getBandeira()
        + "\n Cobrança sem a taxa: $"
        + dados.getCobranca()
        + "\n Total a pagar: $"
        + dados.getTotal());
    }
}

 
