package Domain.Auth.Gateway;

import Domain.Auth.BusinessObject.Employee;

public interface EmployeeGateway {
    public Employee getEmployeeByNameAndPassWord(String name, String passWord);
}
