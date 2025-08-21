import javax.swing.JOptionPane;
public class EntradaSaida{
  static public void main (String [] args) {
    //float(4bytes), double(8bytes)
    //classes empacotadoras(wrappers)
    
    double n1, n2;
    n1 = Double.parseDouble(JOptionPane.showInputDialog("digite um valor"));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));

    double soma = n1 + n2;
    JOptionPane.showMessageDialog(null, soma);

    
  }
}