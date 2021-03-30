package Domain.Auth.UseCase.Login.LoginAsEmployee;


import Domain.Auth.BusinessObject.Employee;

public class UseCase {
    public Response login(Request request) {
        Response response = new Response();

        response.employee= new Employee();
        return response;
    }
}
