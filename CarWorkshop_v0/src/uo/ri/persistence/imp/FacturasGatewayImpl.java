package uo.ri.persistence.imp;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import uo.ri.persistence.FacturasGateway;

public class FacturasGatewayImpl implements FacturasGateway {

	public Connection con;

	@Override
	public void setConnection(Connection con) {
		this.con = con;

	}

	@Override
	public Long getLastInvoiceNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> findById(Long r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Map<String, Object> map) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Map<String, Object> map) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> findByNumber(Long lg) {
		// TODO Auto-generated method stub
		return null;
	}

}
