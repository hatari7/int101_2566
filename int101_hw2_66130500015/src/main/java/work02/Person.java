package work02;

import work01.Utilitor;
import work01.Utilitor.*;
public class Person {
    //2.2
    private static int nextId = 1;
    //2.3
    private final int id;
    //2.4
    private String firstName;
    //2.5
    private  String lastName;

    //2.6
    public Person(String firstName, String lastName) {
        this.firstName = Utilitor.testString(firstName);
        this.lastName = Utilitor.testString(lastName);
        this.id = nextId;
        nextId += 1;
    }
    //2.7
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person(");
        sb.append(id);
        sb.append(",");
        sb.append(firstName);
        sb.append(",");
        sb.append(lastName);
        sb.append(")");
        return sb.toString();
    }
    //2.8

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //2.9
    @Override
    public boolean equals(Object obj){
        return this == obj;
    }

}
