package ge.edu.btu.chat.client;
import java.io.*;

public class Client
{
    public static void main(String[]args) throws IOException
    {
        String answ = new String("გამარჯობა");
        String answ1 = new String("მაჩვენე ფილიალები");
        String answ2 = new String("მაჩვენე ვალუტის კურსი");
        String answ3 = new String("ნახვამდის");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("დასვით კითხვა:");
        String answrep = br.readLine();
        if(answrep .equals(answ))
        {
            System.out.println("მოგესალმებით, რით შემიძლია დაგეხმაროთ?");
        }
        else if(answrep .equals(answ1))
        {
            System.out.println("ი.ჭავჭავაძის გამზ., ვაჟა-ფშაველას გამზ., გურამიშვილის გამზ.");
        }
        else if(answrep .equals(answ2))
        {
            System.out.println("კურსი: დოლარი - 3.3, ევრო - 3.9");
        }
        else if(answrep .equals(answ3))
        {
            System.out.println("მადლობა, რომ დაგვიკავშირდით");
        }

        else
        {
            System.out.println("ამაზე პასუხი არ მაქვს");
        }
    }
}
