package musicstreamingsystem;

import java.util.List;

//singleton class
public class AuthenticationSystem {
    List<Customer> customerList;
    List<Artist> artistList;
    List<Account> accountList;
    List<Admin> adminList;

    private void authenticateUser(User user){

    }

    public void login(User user){
        authenticateUser(user);
    }

    public void logout(User user){

    }
}
