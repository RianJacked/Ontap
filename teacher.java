

public class teacher {
    private String firstName;
    private String lastName;
    private String id;
    private int yearOfBirth;


    public teacher( String firstName, String lastName, String id, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
    }


    public void setFullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge(){
        return 2024 - yearOfBirth;
    }
    public String toString(){
        return getFullName() + " " + id + " " + yearOfBirth;

    }

    public static void main(String[] args){
        teacher teacher = new teacher("Michael","Bay", "S001", 1999);
        System.out.println("Teacher details: "+ teacher.toString());
        System.out.println("Teacher age: "+ teacher.getAge());
    }
}