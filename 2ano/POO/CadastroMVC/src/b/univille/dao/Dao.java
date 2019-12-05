package b.univille.dao;

import java.sql.Connection;

import br.univille.factory.FabricaConexoes;

public class Dao {
	
	public Connection getConnection() {
	 	return FabricaConexoes.getInstance().getConnection();
	 }
}
