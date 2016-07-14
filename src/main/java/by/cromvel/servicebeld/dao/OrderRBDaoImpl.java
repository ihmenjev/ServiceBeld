package by.cromvel.servicebeld.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;
import by.cromvel.servicebeld.model.Employee;
import by.cromvel.servicebeld.model.OrderRB;

@Repository("orderRBDaoImpl")
public class OrderRBDaoImpl extends AbstractDao<Integer, OrderRB> implements OrderRBDao {

	@Override
	public void addOrder(OrderRB order) {
		insertPersist(order);

	}

	@Override
	public void deleteOrder(OrderRB order) {
		deletePersist(order);

	}

	@Override
	public void updateOrder(OrderRB order) {
		update(order);

	}

	@Override
	public void deleteOrderById(int id) {
		deleteOrder(getByKey(id));

	}

	@Override
	public OrderRB getOrderById(int id) {

		return getByKey(id);
	}

	@Override
	public List<OrderRB> getListOrdersAll() {

		return LoadList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderRB> getListOrdersByContragent(Contragent contragent) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("contragent", contragent));
		return (List<OrderRB>) crit.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderRB> getListOrdersByContact(Contact contact) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("contragent", contact.getContragent()));
		return (List<OrderRB>) crit.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderRB> getListOrdersByEmployeeEx(Employee employee) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("courier", employee));
		return (List<OrderRB>) crit.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderRB> getListOrdersByStatus(String status) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("status", status));
		return (List<OrderRB>) crit.list();
	}

	@Override
	public List<OrderRB> getListOrdersByEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
