package app.model;

import javax.persistence.*;

@Entity
@Table(schema = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstName;
    @Column
    private String secondName;
    @Column
    private byte age;
//    private boolean isMarried;

    public User() {

    }

    public User(int id, String firstName, String secondName, byte age) {
        this(firstName, secondName, age);
        this.id = id;
    }

    public User(String firstName, String secondName, byte age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

//    public boolean isMarried() {
//        return isMarried;
//    }
//
//    public void setMarried(boolean married) {
//        isMarried = married;
//    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nИмя: " + firstName +
                "\nФамилия: " + secondName +
                "\nВозраст: " + age +
//                "\nВ браке: " + (isMarried ? "Да" : "Нет") +
                "\n\n";
    }
}
