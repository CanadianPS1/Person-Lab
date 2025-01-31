public class PersonMaker {
    enum sufix{
        Jr,
        Sr,
        THE_SECOND,
        THE_THIRD,
        NULL
    }
    enum prefix{
        MR,
        MS,
        MRS,
        MISS,
        NULL
    }
    private final String name;
    private final int age;
    private sufix postfix = sufix.NULL;
    private prefix beforeFix = prefix.NULL;
    public PersonMaker(String n, int a, String s, String p){
        name = n;
        age = a;
        if(s.equals("null")) postfix = sufix.NULL;
        else switch (s){
            case "jr" -> postfix = sufix.Jr;
            case "sr" -> postfix = sufix.Sr;
            case "second" -> postfix = sufix.THE_SECOND;
            case "third" -> postfix = sufix.THE_THIRD;
            default -> System.err.println("ERROR: Incorect Input for sufix");
        }
        if(p.equals("null")) beforeFix = prefix.NULL;
        else switch (p){
            case "mr" -> beforeFix = prefix.MR;
            case "ms" -> beforeFix = prefix.MS;
            case "mrs" -> beforeFix = prefix.MRS;
            case "miss" -> beforeFix = prefix.MISS;
            default -> System.err.println("ERROR: Incorect Input prefix");
        }
        
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public sufix getSufix(){
        return postfix;
    }
    public prefix getPrefix(){
        return beforeFix;
    }
    
}
