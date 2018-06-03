package webservice;


import javax.xml.ws.Endpoint;

public class BootStrap {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/w/hello",new HelloServiceImpl());
        System.out.println("webservice publish success");
    }
}
