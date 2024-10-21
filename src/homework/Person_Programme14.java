package homework;

public class Person_Programme14 {
    /**
     * Write a class with the name Person. The class needs three fields (instance variables) with the names
     * firstName, lastName of type String and age of type int.
     * Write the following methods (instance methods):
     * *Method named getFirstName without any parameters, it needs to return the value of the firstName
     * field.
     * *Method named getLastName without any parameters, it needs to return the value of the lastName
     * field.
     * *Method named getAge without any parameters, it needs to return the value of the age field.
     * *Method named setFirstName with one parameter of type String, it needs to set the value of the
     * firstName field.
     * *Method named setLastName with one parameter of type String, it needs to set the value of the
     * lastName field.
     * *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
     * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
     * *Method named isTeen without any parameters, it needs to return true if the value of the age field is
     * greater than 12 and less than 20, otherwise, return false.
     * *Method named getFullName without any parameters, it needs to return the full name of the person.
     *     *In case both firstName and lastName fields are empty, Strings return an empty String.
     *     *In case firstName is an empty String, return firstName.
     *     *In case lastName is an empty String, return lastName.
     *
     *
     * To check if s String is empty, use the method isEmpty from the String class. For example,
     * firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
     * contain any characters.
     * TEST EXAMPLE
     *
     * TEST CODE: (Write below code in to main method then check out put)
     * Person person = new Person();
     * person.setFirstName("");   // firstName is set to empty string
     * person.setLastName("");    // lastName is set to empty string
     * person.setAge(10);
     * System.out.println("fullName= " + person.getFullName());
     * System.out.println("teen= " + person.isTeen());
     * person.setFirstName("John");    // firstName is set to John
     * person.setAge(18);
     * System.out.println("fullName= " + person.getFullName());
     * System.out.println("teen= " + person.isTeen());
     * person.setLastName("Smith");    // lastName is set to Smith
     * System.out.println("fullName= " + person.getFullName());
     *
     * OUTPUT
     * fullName=
     * teen= false
     * fullName= John
     * teen= true
     * fullName= John Smith
     * NOTE: All methods should be defined as public NOT public static.
     * NOTE: In total, you have to write 8 methods.
      */

    // instance variable
    private String firstName;
    private String lastName;
    private int age;

    // constructor
    public void person() {
        this.firstName = " ";
        this.lastName = " ";
        this.age = 0;
    }

    // method to get the first name
    public  String getFirstName(){
        return this.firstName;
    }

    // method to get the second name
    public String getLastName(){
        return this.lastName;
    }
    // method to get the age
    public int getAge(){
        return this.age;
    }

    // method to set the first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
     // method to set the last name
    public void  setLastName(String lastName){
        this.lastName = lastName;
    }

    // method to set the age, with validation
    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // method to check if the person is a teenager
    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }

    //method to get the fullname
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if (firstName.isEmpty()){
            return lastName;
        }else if ((lastName.isEmpty())){
            return firstName;
        }else {
            return firstName + " " + lastName;
        }
    }

    // main method for testing
    public static void main(String[] args) {
        Person_Programme14 person = new Person_Programme14();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());
    }
}