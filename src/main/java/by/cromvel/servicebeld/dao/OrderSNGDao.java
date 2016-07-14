package by.cromvel.servicebeld.dao;

import java.util.List;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;
import by.cromvel.servicebeld.model.Employee;
import by.cromvel.servicebeld.model.OrderSNG;

public interface OrderSNGDao {

	public void addOrderSNG(OrderSNG order);

	public void deleteOrderSNG(OrderSNG order);

	public void updateOrderSNG(OrderSNG order);

	public void deleteOrderSNGById(int id);

	public OrderSNG getOrderSNGById(int id);

	public List<OrderSNG> getListOrdersSNGAll();

	public List<OrderSNG> getListOrdersSNGByContragent(Contragent contraget);

	public List<OrderSNG> getListOrdersSNGByContact(Contact contact);

	public List<OrderSNG> getListOrdersSNGByEmployeeEx(Employee employee);

	public List<OrderSNG> getListOrdersSNGByStatus(String status);

	public List<OrderSNG> getListOrdersSNGByEmployee(Employee employee);

}
