package Domain.Auth.UseCase.Login.LoginAsClient;

import Domain.Auth.BusinessObject.Client;

public class UseCase {
    public Response login(Request request) {
        Response response = new Response();

        response.client = new Client();
        return response;
    }
}
