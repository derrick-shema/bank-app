package Domain.Bank.UseCase.ViewTransactionHistory;

import Domain.Bank.BusinessObject.Transaction;

import java.util.Collections;
import java.util.List;

public class UseCase {
    public Response viewTransactionHistory(Request request) {
        Response response = new Response();
        response.transactionHistory = Collections.emptyList();
        return response;
    }
}
