package command;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Song;
import connectionprovider.ConnectionProvider;

public class DeleteSongCommand {
	public void execute(int id) {
		boolean result;
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM SONGS WHERE id=?");
			stmt.setInt(1, id);
			
			result = stmt.execute();
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}