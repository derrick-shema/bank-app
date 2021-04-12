package Domain.Bank.UseCase.CheckCredit;

import Domain.Bank.BusinessObject.CreditScore;

public class UseCase {
    public Response checkCredit(Request request) {
        Response response = new Response();
        response.creditScore = new CreditScore();
        // TODO: LOGIC HERE...
        return response;
    }
}
