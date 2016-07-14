package by.cromvel.servicebeld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.cromvel.servicebeld.dao.OrderRBDao;
import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;
import by.cromvel.servicebeld.model.Employee;
import by.cromvel.servicebeld.model.OrderRB;

@Service("orderRBDao")
@Transactional
public class OrderRBServiceImpl implements OrderRBService {

	@Autowired
	OrderRBDao orderRBDao;

	@Override
	public void addOrder(OrderRB order) {

		orderRBDao.addOrder(order);
	}

	@Override
	public void deleteOrder(OrderRB order) {
		orderRBDao.deleteOrder(order);

	}

	@Override
	public void updateOrder(OrderRB order) {
		orderRBDao.updateOrder(order);

	}

	@Override
	public void deleteOrderById(int id) {
		orderRBDao.deleteOrderById(id);

	}

	@Override
	public OrderRB getOrderById(int id) {

		return orderRBDao.getOrderById(id);
	}

	@Override
	public List<OrderRB> getListOrdersAll() {

		return orderRBDao.getListOrdersAll();
	}

	@Override
	public List<OrderRB> getListOrdersByContragent(Contragent contragent) {

		return orderRBDao.getListOrdersByContragent(contragent);
	}

	@Override
	public List<OrderRB> getListOrdersByContact(Contact contact) {

		return orderRBDao.getListOrdersByContact(contact);
	}

	@Override
	public List<OrderRB> getListOrdersByEmployeeEx(Employee employee) {

		return orderRBDao.getListOrdersByEmployeeEx(employee);
	}

	@Override
	public List<OrderRB> getListOrdersByStatus(String status) {

		return orderRBDao.getListOrdersByStatus(status);
	}

	@Override
	public List<OrderRB> getListOrdersByEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
