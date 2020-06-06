package Strategy_ex6_1;

import java.util.Calendar;
import java.util.Date;

public class Messenger {
	public void enviarMensagem() {
		
		int diaDaSemana = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		diaDaSemana = c.get(Calendar.DAY_OF_WEEK);
		MensagemDoDia msg;

		switch (diaDaSemana) {
		case 1:
			msg = new MensagemDeDomingo();
			break;
		case 2:
			msg = new MensagemDeSegunda();
			break;
		case 3:
			msg = new MensagemDeTerca();
			break;
		case 4:
			msg = new MensagemDeQuarta();
			break;
		case 5:
			msg = new MensagemDeQuinta();
			break;
		case 6:
			msg = new MensagemDeSexta();
			break;
		case 7:
			msg = new MensagemDeSabado();
			break;
		default:
			msg = new DiaSemMensagem();
			break;
		}

		System.out.println(msg.mensagem());
	}
}