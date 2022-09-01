package br.com.motorola.teste;


import javax.swing.JOptionPane;

import br.com.motorola.beans.Celular;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int i = 0;
		
		Celular [] celular = new Celular[5];
		
		
		for(i = 0; i < 4;  i++ ) {
			
			
			
		    String nome = JOptionPane.showInputDialog("Digite o Nome do celular");	
		    Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		    Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		    Double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura"));
		    
		    celular[i]  = new Celular();
		    celular[i].setNome(nome);
		    celular[i].setPeso(peso);
		    celular[i].setAltura(altura);
		    celular[i].setLargura(largura);
		    
			
			
			
			   }
			
			  for(Celular Celular : celular ) {
				  
				  System.out.println("\n Nome do celular "+ Celular.getNome()+  "\n o peso " + Celular.getPeso()+ "\n a altura " + Celular.getAltura() + "\n a largura " + Celular.getLargura());
			  }
		
		
		
	}

}
