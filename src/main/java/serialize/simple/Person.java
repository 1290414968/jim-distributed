package serialize.simple;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.io.Serializable;

public class Person implements Serializable {
    @Protobuf(fieldType = FieldType.STRING,order = 1)
    private String name;
    private transient String code;
    public static double d = 1d;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getD() {
        return d;
    }

    public static void setD(double d) {
        Person.d = d;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
