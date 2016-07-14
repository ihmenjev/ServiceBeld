package by.cromvel.servicebeld.service;

import java.util.List;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;
import by.cromvel.servicebeld.model.Employee;
import by.cromvel.servicebeld.model.OrderRB;

public interface OrderRBService {

	public void addOrder(OrderRB order);

	public void deleteOrder(OrderRB order);

	public void updateOrder(OrderRB order);

	public void deleteOrderById(int id);

	public OrderRB getOrderById(int id);

	public List<OrderRB> getListOrdersAll();

	public List<OrderRB> getListOrdersByContragent(Contragent contragent);

	public List<OrderRB> getListOrdersByContact(Contact contact);

	public List<OrderRB> getListOrdersByEmployeeEx(Employee employee);

	public List<OrderRB> getListOrdersByStatus(String status);

	public List<OrderRB> getListOrdersByEmployee(Employee employee);
}
