package by.cromvel.servicebeld.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;
import by.cromvel.servicebeld.model.OrderRB;
import by.cromvel.servicebeld.service.ContactService;
import by.cromvel.servicebeld.service.ContragentService;
import by.cromvel.servicebeld.service.OrderRBService;

@RestController
public class RestOrderController {

	@Autowired
	ContragentService contragentService;

	@Autowired
	ContactService contactService;

	@Autowired
	OrderRBService orderService;

	@RequestMapping(value = "/rc/getallorders/", method = RequestMethod.GET, produces = {
			"application/json; charset=UTF-8" })
	public ResponseEntity<String> getAllOrders() {
		//JSONArray jsa = new JSONArray();

		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@RequestMapping(value = "/rc/getordersbylogin/", method = RequestMethod.POST, produces = {
			"application/json; charset=UTF-8" })
	public @ResponseBody ResponseEntity<String> getOrdersByLogin(@RequestBody String jsonString) {
		String login = new JSONObject(jsonString).getString("login");

		System.out.println("from restOrderController login is: " + login);
		
		Contact contact = contactService.getContactByLogin(login);
		
		//System.out.println("from restOrderController contact is: " + contact.getContact());
		
		Contragent contragent = contact.getContragent();
		JSONArray jsArrOrders = new JSONArray();
		JSONObject jsoResponse = new JSONObject();
		JSONObject jsoContact = new JSONObject();
		JSONObject jsoContragent = new JSONObject();

		jsoContact.put("ID", contact.getId());
		jsoContact.put("Contact", contact.getContact());
		jsoContact.put("Country", contact.getCountry());
		jsoContact.put("City", contact.getCity());
		jsoContact.put("Phone", contact.getPhone());
		jsoContact.put("Email", contact.getEmail());
		jsoContact.put("Skype", contact.getSkype());
		jsoContact.put("AddTime", contact.getAddTime());
		jsoContact.put("Dead", contact.getDead());

		jsoResponse.put("contact", jsoContact);

		jsoContragent.put("ID", contragent.getId());
		jsoContragent.put("Client", contragent.getClient());
		jsoContragent.put("INN", contragent.getInn());
		jsoContragent.put("bank", contragent.getBank());
		jsoContragent.put("AddressFact", contragent.getAddressFact());
		jsoContragent.put("Phone", contragent.getPhone());
		jsoContragent.put("Fax", contragent.getFax());
		jsoContragent.put("Email", contragent.getEmail());
		jsoContragent.put("AddTime", contragent.getAddTime());
		jsoContragent.put("Dead", contragent.getDead());

		jsoResponse.put("contragent", jsoContragent);

		List<OrderRB> listOrders = orderService.getListOrdersByContact(contact);

		for (OrderRB orderRb : listOrders) {
			JSONObject jsoOrder = new JSONObject();
			try {
				jsoOrder.put("ID", orderRb.getId());
				jsoOrder.put("OrderDate", orderRb.getOrderDate());
				jsoOrder.put("PaymentStatus", orderRb.getPaymentStatus());
				jsoOrder.put("Cena", orderRb.getCena());
				jsoOrder.put("costGruz", orderRb.getCostGruz());
				jsoOrder.put("AdrDost", orderRb.getAdrDost());
				jsoOrder.put("Gruz", orderRb.getGruz());
				jsoOrder.put("AddTime", orderRb.getAddTime());
				jsoOrder.put("Status", orderRb.getStatus());
				jsoOrder.put("contact", orderRb.getContact());
				jsoOrder.put("DateZajavkComplete", orderRb.getDateZajavkComplete());
				jsoOrder.put("AdrZagr", orderRb.getAdrZagr());
				jsoOrder.put("VremZagr", orderRb.getVremZagr());
				jsoOrder.put("Primech", orderRb.getPrimech());

				jsArrOrders.put(jsoOrder);

			} catch (NullPointerException e) {
				e.printStackTrace();
				jsoOrder = null;
				continue;
			}

		}

		jsoResponse.put("orders", jsArrOrders);

		return new ResponseEntity<String>(jsoResponse.toString(), HttpStatus.OK);

	}

}
