package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Login;

public class LoginDao {

	public void consultarActoressDao(Connection conn, Integer id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			List<Login> pagos = new ArrayList<Login>();
			String sql = "select actor_id,first_name, last_name from actor where ? = actor_id";

			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Login l = new Login();
				l.setId(rs.getInt("actor_id"));
				l.setNombre(rs.getString("first_name"));
				l.setApellido(rs.getString("last_name"));				
			}

		} finally {
			try {
				stmt.close();
			} catch (Exception ignore) {
			}
		}

	}
}
