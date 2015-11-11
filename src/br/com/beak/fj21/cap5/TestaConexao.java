package br.com.beak.fj21.cap5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;


public class TestaConexao {

	public static void main(String[] args) throws ParseException {
		ContatoDAO contatos = new ContatoDAO();
		Contato fabio = new Contato();
		fabio.setNome("Fabio dos Santos");
		fabio.setEmail("fabinho@santos.com");
		fabio.setEndereco("Rua Satuba, n.21");
		Calendar dtn = Calendar.getInstance();
		dtn.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2000"));
		fabio.setDataNascimento(dtn);
		
		contatos.adiciona(fabio);
		List<Contato> listagem = contatos.listaDeContatos();
		for (Contato contato : listagem) {
			SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
			data1.format(contato.getDataNascimento().getTime());
			System.out.println(contato.getNome()+" "+data1.format(Calendar.getInstance().getTime()));
		}
		
		
	}

}
