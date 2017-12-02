package uo.ri.business;

import java.util.List;
import java.util.Map;

public interface AdminService {
	public abstract void newMechanic(String nombre, String apellidos);

	public abstract void deleteMechanic(Long idMecanico);

	public abstract void updateMechanic(Long idMecanico, String nombre, String apellido);

	public abstract List<Map<String, Object>> findAllMechanics();

}
