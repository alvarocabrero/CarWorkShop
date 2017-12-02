package uo.ri.business.impl;

import java.util.List;
import java.util.Map;

import uo.ri.business.CashService;
import uo.ri.business.impl.cash.CreateInvoiceFor;
import uo.ri.common.BusinessException;

public class CashServiceImpl implements CashService {

	@Override
	public Map<String, Object> createInvoiceFor(List<Long> list) {
		try {
			return new CreateInvoiceFor(list).execute();
		} catch (BusinessException e) {
			
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Map<String, Object> findInvoice(Long l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> findPayMethodsForInvoice(Long r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void settleInvoice(Long l, Map<Long, Double> r) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Map<String, Object>> findRepairsByClient(String r) {
		// TODO Auto-generated method stub
		return null;
	}

}
