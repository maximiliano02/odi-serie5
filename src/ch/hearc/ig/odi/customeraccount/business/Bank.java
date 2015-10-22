package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashSet;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.business.Account;

public class Bank {
	private int _number;
	private String _name;
	private HashSet<Customer> _customers = new HashSet<Customer>();
	private HashSet<Account> _accounts = new HashSet<Account>();

	public Bank(int aNumber, String aName) {
		throw new UnsupportedOperationException();
	}

	public Account getAccountByNumber(String aNumber) {
		throw new UnsupportedOperationException();
	}

	public Customer getCustomerByNumber(int aNumber) {
		throw new UnsupportedOperationException();
	}

	public void addAccount(int aNumber, String aFirstName, String aLastName) {
		throw new UnsupportedOperationException();
	}

	public void addCustomer(String aNumber, String aName, double aRate, Customer aCustomer) {
		throw new UnsupportedOperationException();
	}
}