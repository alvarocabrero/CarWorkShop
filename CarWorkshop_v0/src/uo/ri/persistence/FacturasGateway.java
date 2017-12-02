package uo.ri.persistence;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public interface FacturasGateway {

	public void setConnection(Connection con);

	public Long getLastInvoiceNumber();

	public Map<String, Object> findById(Long r);

	public List<Map<String, Object>> findAll();

	public void save(Map<String, Object> map);

	public void delete(Long r);

	public void update(Map<String, Object> map);

	public Map<String, Object> findByNumber(Long lg);
}
