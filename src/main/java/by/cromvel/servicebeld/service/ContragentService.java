package by.cromvel.servicebeld.service;

import by.cromvel.servicebeld.model.Contact;
import by.cromvel.servicebeld.model.Contragent;

public interface ContragentService {

	public Contragent getContragentById(int id);

	public Contragent getContragentByContact(Contact contact);

	public Contragent getContragentByContactId(int id);
}
