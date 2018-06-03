package serialize.simple;

import java.io.*;

public class SeriableTest {
    public static void main(String[] args) {
        seMethod();
        Person.d = 100d;
        Person person = deMethod();
        System.out.println(person);
        System.out.println(person.getD());

        Person person1 = deMethod();
        System.out.println(person);
        System.out.println(person.getD());
    }
    private static void seMethod(){
        try {
            ObjectOutputStream objectOutputStream  = new ObjectOutputStream(new FileOutputStream(new File("person")));
            Person person = new Person();
            person.setName("test1");
            person.setCode("11");
            objectOutputStream.writeObject(person);

            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Person deMethod(){
        try {
            ObjectInputStream objectInputStream  = new ObjectInputStream(new FileInputStream(new File("person")));
            Person person =  (Person) objectInputStream.readObject();
            objectInputStream.close();
            return person;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
