package Domain.Bank.UseCase.ApplyForLineOfCredit;

import Domain.Bank.BusinessObject.LineOfCredit;

public class UseCase {
    public Response applyForLineOfCredit(Request request) {
        Response response = new Response();
        response.lineOfCredit = new LineOfCredit();
        // TODO: ADD LOGIC HERE...
        return response;
    }
}
