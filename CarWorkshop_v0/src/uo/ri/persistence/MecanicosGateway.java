package uo.ri.persistence;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public interface MecanicosGateway {
	public void setConnection(Connection s);

	public Map<String, Object> findById(Long r);

	public List<Map<String, Object>> findAll();

	public void update(Long r, String s, String a);

	public void save(String a, String b);

	public void delete(Long r);
}
