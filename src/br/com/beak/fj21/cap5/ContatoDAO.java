package br.com.beak.fj21.cap5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoDAO{

	private Connection conexao = new ConnectionFactory().getConnection();	

	public void adiciona(Contato contato) {
		String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?,?,?,?)";
		try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Contato> listaDeContatos() {
		String sql = "select * from contatos";
		List<Contato> lista = new ArrayList<Contato>();
		try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					Calendar dataNasc = Calendar.getInstance();
					dataNasc.setTime(rs.getDate("dataNascimento"));
					Contato c = new Contato();
					c.setNome(nome);
					c.setEmail(email);
					c.setEndereco(endereco);
					c.setDataNascimento(dataNasc);
					lista.add(c);
				}
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
