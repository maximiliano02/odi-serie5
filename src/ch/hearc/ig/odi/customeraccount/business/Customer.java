package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private List<Account> accounts;
	private int number;
	private String firstName;
	private String lastName;

	/**
	 * 
	 * @param number
	 * @param firstName
	 * @param lastName
	 */
	public Customer(int number, String firstName, String lastName) {
            this.number = number;
            this.firstName = firstName;
            this.lastName = lastName;
            
            this.accounts = new ArrayList();
        }

	/**
	 * 
	 * @param number
	 */
	/*public Account getAccountByNumber(String number) {
            for(Account account : accounts){
                // TODO recherche du bon compte et retour
                if (account.) {
                    
                }
            }
	}*/

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(String number, String name, double rate) {
		// TODO - implement Customer.addAccount
		throw new UnsupportedOperationException();
	}

}