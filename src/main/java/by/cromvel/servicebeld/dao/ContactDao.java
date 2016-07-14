package by.cromvel.servicebeld.dao;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;

public interface ContactDao {

	public Contact getContactByLogin(String login);

	public Contact getContactById(int id);

	public Contragent getContragentByContact(Contact contact);

	public Contragent getContragentByContactId(int id);
}
