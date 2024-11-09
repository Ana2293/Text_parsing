
public class Person extends Program_2{
    public static void main(String[] args){

    }
    String firstname;
    String lastname;
    String birthplace;

    public Person(String firstname, String lastname, String birthplace) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthplace = birthplace;
    }
    @Override
    public String toString(){
        return (firstname+" "+lastname+" "+birthplace);

    }
}






