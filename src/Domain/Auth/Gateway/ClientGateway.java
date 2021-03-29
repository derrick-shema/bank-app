package Domain.Auth.Gateway;

import Domain.Auth.BusinessObject.Client;

public interface ClientGateway {
    public Client getClientByUserNameAndPassword(String userName, String password);
}
