package b.univille.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.univille.model.AnimalModel;

public class AnimalDao extends Dao {
	
	//Inserir um Animal

	public void insert(AnimalModel animal) {

		String sql = "INSERT INTO Animal(nome, raca, corPelo) values(?,?,?)";
		
		try (Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)){
			
			statement.setString(1, animal.getNome());
			statement.setString(2, animal.getRaca());
			statement.setString(3, animal.getCorPelo());
			
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Excluir um nimal
	
	public void delete(AnimalModel animal) {
		
		String sql = "DELETE FROM Animal WHERE id = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			
			statement.setLong(1, animal.getId());
			
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Editar um animal
	
	public void update(AnimalModel animal) {
		String sql = "UPDATE Asuario SET nome = ?, raca = ?, corPelo = ? WHERE if = ?";
		
		try (Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)){
			
			statement.setString(1, animal.getNome());
			statement.setString(2, animal.getRaca());
			statement.setString(3, animal.getCorPelo());
			statement.setLong(3, animal.getId());
			
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Obter um animal
	
	public AnimalModel getByEmail(Long id) {
		AnimalModel animal = null;
		String sql = "SELECT nome, raca, corPelo FROM Animal WHERE id = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			
			statement.setLong(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				animal = new AnimalModel();
				animal.setNome(resultSet.getString(1));
				animal.setRaca(resultSet.getString(2));
				animal.setCorPelo(resultSet.getString(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return animal;
	}
}
