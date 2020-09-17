package es.toni.services;

import es.toni.commands.CustomerForm;
import es.toni.domain.Customer;

public interface CustomerService extends CRUDService<Customer>{

    Customer saveOrUpdateCustomerForm(CustomerForm customerForm);

}
