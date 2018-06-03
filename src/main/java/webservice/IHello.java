package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHello {
    @WebMethod
    String sayHello(String msg);
}
