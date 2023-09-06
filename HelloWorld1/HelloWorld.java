public class HelloWorld

{
    public static void main(String[] args)
    {
        int i = 10;
        double f = 2.5;
        boolean flag = true;
        f += i;
        i++;
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string3);
        String[]  arraystring = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int i1 = 0; i1 < arraystring.length; i1++) {
            System.out.println(arraystring[i1]);
        }
        System.out.println(" ");
        for (String value : arraystring) {
            System.out.println(value);
        }
        for (int idx = 0; idx < arraystring.length; idx++) {
            System.out.print(arraystring[idx]);
            if (idx < arraystring.length-1){
                System.out.print("-");
            }
        }
        System.out.println(" ");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(stringsEqual);
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        
    }
}