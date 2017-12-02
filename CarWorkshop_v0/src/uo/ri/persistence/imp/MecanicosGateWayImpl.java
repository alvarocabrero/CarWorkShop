package uo.ri.persistence.imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import uo.ri.persistence.MecanicosGateway;

public class MecanicosGateWayImpl implements MecanicosGateway {
	Connection con;

	@Override
	public void setConnection(Connection s) {
		con = s;
 
	}

	@Override
	public Map<String, Object> findById(Long r) {
		if (con != null) {
			try {
				Statement st = con.createStatement();
				st.executeQuery("Select select id, nombre, apellidos from TMecanicos");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long r, String s, String a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(String a, String b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long r) {
		// TODO Auto-generated method stub

	}

}
