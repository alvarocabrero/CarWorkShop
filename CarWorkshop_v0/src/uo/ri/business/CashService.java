package uo.ri.business;

import java.util.List;
import java.util.Map;

public interface CashService {
	public abstract Map<String, Object> createInvoiceFor(List<Long> list);

	public abstract Map<String, Object> findInvoice(Long l);

	public abstract List<Map<String, Object>> findPayMethodsForInvoice(Long r);

	public abstract void settleInvoice(Long l, Map<Long, Double> r);

	public List<Map<String, Object>> findRepairsByClient(String r);
}
