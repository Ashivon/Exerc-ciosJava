import java.util.Calendar;
public class Salão {
	public static void main(String[] args) {
		Calendar data=Calendar.getInstance();
		
		//CLIENTES E ATENDIMENTOS
		Cliente cliente1=new Cliente(343);
		cliente1.setId(1);
		cliente1.setNome("João");
		
		Cliente cliente2=new Cliente(33676);
		cliente2.setId(2);
		cliente2.setNome("Maria");
		
		Cliente cliente3=new Cliente(37238);
		cliente3.setId(3);
		cliente3.setNome("Jéssica");	
		
		//CABELEREIROS
		Cabelereiro cabelereiro1=new Cabelereiro(9878, "Carlos");
		cabelereiro1.setId(5);
		
		Cabelereiro cabelereiro2=new Cabelereiro(5648, "Abraão");
		cabelereiro1.setId(6);
		
		Cabelereiro cabelereiro3=new Cabelereiro(6489, "Cláudio");
		cabelereiro1.setId(7);
	
		//AGENDAMENTOS
		data.set(Calendar.YEAR, 2022);
		data.set(Calendar.MONTH, 10);
		data.set(Calendar.DAY_OF_MONTH, 14);
		data.set(Calendar.HOUR_OF_DAY, 20);
		data.set(Calendar.MINUTE, 15);
		Agendamento agendamento1= new Agendamento(14, cliente1, data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH), data.get(Calendar.YEAR), data.get(Calendar.HOUR_OF_DAY), data.get(Calendar.MINUTE), cabelereiro2);
		
		data.set(Calendar.YEAR, 1998);
		data.set(Calendar.MONTH, 7);
		data.set(Calendar.DAY_OF_MONTH, 3);
		data.set(Calendar.HOUR_OF_DAY, 8);
		data.set(Calendar.MINUTE, 45);
		Agendamento agendamento2= new Agendamento(15, cliente2, data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH), data.get(Calendar.YEAR), data.get(Calendar.HOUR_OF_DAY), data.get(Calendar.MINUTE), cabelereiro3);
		
		data.set(Calendar.YEAR, 2008);
		data.set(Calendar.MONTH, 3);
		data.set(Calendar.DAY_OF_MONTH, 25);
		data.set(Calendar.HOUR_OF_DAY, 14);
		data.set(Calendar.MINUTE, 30);
		Agendamento agendamento3= new Agendamento(16, cliente3, data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH), data.get(Calendar.YEAR), data.get(Calendar.HOUR_OF_DAY), data.get(Calendar.MINUTE), cabelereiro1);
				
		//SERVIÇOS
		Servico servico1=new Servico(10, "barba", 20);
		servico1.setDescricao("Aparar e definir barba.");
		
		Servico servico2=new Servico(11, "sobrancelha", 15);
		servico2.setDescricao("Aparar e definir sobrancelha.");
		
		Servico servico3=new Servico(12, "cabelo", 25);
		servico3.setDescricao("Aparar e definir cabelo.");
		
		//ATENDIMENTOS
		Atendimento atendimento1= new Atendimento(cliente1, data.HOUR_OF_DAY, data.DAY_OF_MONTH, data.MONTH, data.YEAR, data.MINUTE, cabelereiro2);
		Atendimento atendimento2= new Atendimento(cliente2, data.HOUR_OF_DAY, data.DAY_OF_MONTH, data.MONTH, data.YEAR, data.MINUTE, cabelereiro3);
		Atendimento atendimento3= new Atendimento(cliente3, data.HOUR_OF_DAY, data.DAY_OF_MONTH, data.MONTH, data.YEAR, data.MINUTE, cabelereiro1);
	}
}
