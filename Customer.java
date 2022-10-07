package newatm;

import java.util.ArrayList;

public class Customer {
    ArrayList<CustomerDetails> data = new ArrayList<CustomerDetails>();
       public Customer() {
        CustomerDetails customer1 = new CustomerDetails(123456789, "Mary", 1235, 2000);
        CustomerDetails customer2 = new CustomerDetails(123456690, "Peter", 1236, 3000);
        CustomerDetails customer3 = new CustomerDetails(123723434, "Paul", 1237, 4000);
        CustomerDetails customer4 = new CustomerDetails(123823423, "John", 1238, 5000);
        CustomerDetails customer5 = new CustomerDetails(123461467, "steve", 1234, 1000);
        data.add(customer1);
        data.add(customer2);
        data.add(customer3);
        data.add(customer4);
        data.add(customer5);  
       }
}