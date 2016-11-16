package it.alfasoft.gheorghe.test;
import java.io.ObjectInputStream.GetField;

import it.alfasoft.gheorghe.rubrica.Rubrica;
import it.alfasoft.gheorghe.rubrica.Voce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	//creo una Rubrica con il riferimento il riferimento alla rubrica che ho nel beans.xml	 
		 Rubrica rubrica = (Rubrica) context.getBean("Giorgio");
		 
	//assegno una referenza contattoB alla nuova voce..
		 Voce voce1= (Voce) context.getBean("contatoB");
		 
	//stampo i detagli del contatoB che si trova nella Rubrica(Giorgio)	 
		 System.out.println(voce1.getCognome()+" "+voce1.getNome()+" "+voce1.getCell());
		 
	//qui stampo tutti i contatti che sono dentro la mia rubrica(Giorgio) che è situata nel beans.xml	 
		 for(int i=0; i<rubrica.getVoci().size(); i++){
			 System.out.println(rubrica.getVoci().get(i).getCognome()+" "+rubrica.getVoci().get(i).getNome()+" "+rubrica.getVoci().get(i).getCell());
		 }
		
	//stampo il celulare del contatto (Mario).....	 
		 System.out.println(rubrica.getVoceByName("Mario").getCell());
		 
		 

	}

}
