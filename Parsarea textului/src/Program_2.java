import javax.naming.Name;
import java.util.ArrayList;

public class Program_2 {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] textArray = text.split(" ");
        ArrayList personList = new ArrayList();

        for (int i = 0; i< textArray.length; i++)
        {
            //System.out.println(textArray[i]);
            String[] Name_BirthPlace = textArray[i].split("/");
            String NameOfPerson= Name_BirthPlace[0];
            String PlaceOfBirth=Name_BirthPlace[1];

            //System.out.println(NameOfPerson);

            String[] NameLastName = NameOfPerson.split("\\.");
            //System.out.println(NameLastName.length);

            String Name = NameLastName[0];
            String LastName = NameLastName[1];
            System.out.println(Name+" "+LastName+" "+PlaceOfBirth);
            personList.add(new Person(Name,LastName,PlaceOfBirth));

        }
        System.out.println(personList.toString());
    }
}