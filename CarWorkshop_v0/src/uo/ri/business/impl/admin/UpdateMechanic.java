package uo.ri.business.impl.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import alb.util.console.Console;
import alb.util.jdbc.Jdbc;
import alb.util.menu.Action;
import uo.ri.common.BusinessException;

public class UpdateMechanic implements Action {
	private static String SQL = "update TMecanicos " + "set nombre = ?, apellidos = ? " + "where id = ?";
	private String nombre;
	private String apellidos;
	private long id;

	public UpdateMechanic(String nombre, String apellidos, long id) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
	}

	@Override
	public void execute() throws BusinessException {

		// Procesar
		Connection c = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			c = Jdbc.getConnection();

			pst = c.prepareStatement(SQL);
			pst.setString(1, nombre);
			pst.setString(2, apellidos);
			pst.setLong(3, id);

			pst.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			Jdbc.close(rs, pst, c);
		}

	}

}
