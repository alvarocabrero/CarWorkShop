package uo.ri.ui.admin.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import uo.ri.business.impl.admin.DeleteMechanic;
import uo.ri.business.impl.AdminServiceImpl;
import uo.ri.common.BusinessException;
import alb.util.console.Console;
import alb.util.jdbc.Jdbc;
import alb.util.menu.Action;

public class DeleteMechanicAction implements Action {

	private static String SQL = "delete from TMecanicos where id = ?";

	@Override
	public void execute() throws BusinessException {
		Long idMecanico = Console.readLong("Id de mecánico");

		new AdminServiceImpl().deleteMechanic(idMecanico);

		Console.println("Se ha eliminado el mecánico");
	}

}
