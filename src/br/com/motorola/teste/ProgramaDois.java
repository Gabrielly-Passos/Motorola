package br.com.motorola.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.motorola.beans.Celular;

public class ProgramaDois {

	public static void main(String[] args) {
		
		Celular celularUm = new Celular();
		
		celularUm.setNome("Asus");
		celularUm.setPeso(8);
		celularUm.setAltura(5);
		celularUm.setLargura(9);
		
		
        Celular celularDois = new Celular();
		
        celularDois.setNome("Moto E");
        celularDois.setPeso(15);
        celularDois.setAltura(25);
        celularDois.setLargura(18);
        
       /* ----------------------------------------------------*/
        
        List<Celular>  celularArrayList = new ArrayList<Celular>(); 
        
        celularArrayList.add(celularDois);
        celularArrayList.add(celularUm);
        
		
		System.out.println("Exibir" + celularDois + "Dois " + celularUm );
		
		
	}

}
