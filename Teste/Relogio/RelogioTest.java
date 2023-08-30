package Relogio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RelogioTest {

		@Test
		public void testReiniciarMeiaNoite() {
			Relogio relogio = new Relogio();
		    relogio.definirHorario(17, 23, 15);
		    // Testando a função de reiniciar o relogio para meia noite
		    relogio.reiniciarMeiaNoite();
		    assertEquals("00:00:00", relogio.obterHorario());
		}
	
	   @Test
	   public void testDefinirHorario() {
	       Relogio relogio = new Relogio();
	       // Testando a função de programar o relogio para determinado horário 
	       relogio.definirHorario(15, 13, 0);
	       assertEquals("15:13:00", relogio.obterHorario());
	   }


}
