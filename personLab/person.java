import java.util.ArrayList;
import java.util.Scanner;
public class person{
    private final int myAge = 18;
    public void play(){
        ArrayList<String> names = new ArrayList<>();
        try (Scanner read = new Scanner(System.in)) {
            String playing = "";
            while(!(playing.equals("exit"))){
                String name, sufix, prefix;
                int age; 
                System.out.print("Whats your name? : ");
                name = read.nextLine();
                System.out.println("");
                System.out.print("Whats your age? : ");
                age = read.nextInt();
                read.nextLine();
                System.out.println("");
                System.out.print("Whats your prefix? (type null if none) : ");
                prefix = read.nextLine().toLowerCase();
                System.out.println("");
                System.out.print("Whats your sufix? (type null if none) : ");
                sufix = read.nextLine().toLowerCase();
                System.out.println("");
                PersonMaker person1 = new PersonMaker(name, age, sufix, prefix);
                names.add(getCompletedName(person1, names) + "");
                if(person1.getAge() < myAge) System.out.println("HAHA im older then you");
                else if(person1.getAge() > myAge) System.out.println("AWWW your older then me");
                else System.out.println("WHAT your the same age as me >:(");
                System.out.println("Type EXIT to stop the program, or PLAY to keep playing");
                playing = read.nextLine().toLowerCase();
            }
            System.exit(0);
        }catch(Exception e){
            System.err.println("ERROR: Invalid input");
        }
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public ArrayList getCompletedName(PersonMaker person1, ArrayList names){
        String name = "";
        if(!(person1.getPrefix() == PersonMaker.prefix.NULL)){
            System.out.print(person1.getPrefix() + ". ");
            name += person1.getPrefix() + ". ";
        }
        System.out.print(person1.getName());
        name += person1.getName();
        if(!(person1.getSufix() == PersonMaker.sufix.NULL)){
            System.out.println(" " + person1.getSufix());
            name += " " + person1.getSufix();
        }
        System.out.println("AGE: " + person1.getAge());
        names.add(name);
        return names;
    }   
}