package webservice;

import javax.jws.WebService;

@WebService
public class HelloImpl implements  IHello {
    public String sayHello(String msg) {
        System.out.println("method in ......"+msg);
        return "result"+msg;
    }
}
