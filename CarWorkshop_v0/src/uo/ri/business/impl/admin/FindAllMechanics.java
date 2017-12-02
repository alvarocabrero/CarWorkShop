package uo.ri.business.impl.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import alb.util.console.Console;
import alb.util.jdbc.Jdbc;
import alb.util.menu.Action;
import uo.ri.common.BusinessException;

public class FindAllMechanics {

	private static String SQL = "select id, nombre, apellidos from TMecanicos";

	public List<Map<String, Object>> execute() throws BusinessException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Connection c = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			c = Jdbc.getConnection();

			pst = c.prepareStatement(SQL);

			rs = pst.executeQuery();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id: ", rs.getString(1));
				map.put("nombre: ", rs.getString(2));
				map.put("apellido: ", rs.getString(3));
				list.add(map);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {

			Jdbc.close(rs, pst, c);
		}
		return list;
	}
}
