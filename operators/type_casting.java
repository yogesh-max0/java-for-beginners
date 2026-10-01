// type casting is changing one datatype into another datatype

public class type_casting {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        String name = "12345";

        int c = a/b;
        float d = (float)a / (float)b;
        int e = Integer.parseInt(name);

        int f = 10000000;
        String check = String.valueOf(f);

        boolean g = false;
        String checks = String.valueOf(g);

        String name1 = "true";
        boolean values = Boolean.parseBoolean(name1);

        double n = 100.90;
        float n1 = (float) n;
        
        System.out.print((c)+"\n");
        System.out.print((d)+"\n");
        System.out.print((e)+"\n");
        System.out.print((check)+"\n");
        System.out.print((checks)+"\n");
        System.out.print((values)+"\n");
        System.out.print(n1);
    }
}
