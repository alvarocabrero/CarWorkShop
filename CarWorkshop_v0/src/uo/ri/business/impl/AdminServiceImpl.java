package uo.ri.business.impl;

import java.util.List;
import java.util.Map;

import uo.ri.business.AdminService;
import uo.ri.business.impl.admin.AddMechanic;
import uo.ri.business.impl.admin.DeleteMechanic;
import uo.ri.business.impl.admin.FindAllMechanics;
import uo.ri.business.impl.admin.UpdateMechanic;
import uo.ri.common.BusinessException;

public class AdminServiceImpl implements AdminService {

	@Override
	public void newMechanic(String nombre, String apellidos) {
		try {
			new AddMechanic(nombre, apellidos).execute();
		} catch (BusinessException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteMechanic(Long idMecanico) {
		try {
			new DeleteMechanic(idMecanico).execute();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateMechanic(Long idMecanico, String nombre, String apellido) {
		try {
			new UpdateMechanic(nombre, apellido, idMecanico).execute();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Map<String, Object>> findAllMechanics() {
		try {
			return new FindAllMechanics().execute();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
