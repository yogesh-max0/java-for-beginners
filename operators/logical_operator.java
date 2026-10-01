// logical operator consists of three types they are (NOT , AND , OR)
// ( NOT (!) ) if true then false and if false then true
// ( OR (||) ) atleast one must be true
// ( AND (&&) )  

public class logical_operator{
    public static void main(String args[])
    {
         // ( NOT !)
        boolean a = true;              // if true then output is false in not operator
        boolean b = false;             // if false then output istrue in not operator
        
        // ( AND &&)
        boolean c = true;              // both condition must be true
        boolean d = false; 

        // ( OR ||)
        boolean e = true;              // only one condition needs to be true
        boolean f = false;
        
        System.out.print(!a +"\n");    
        System.out.print(!b +"\n");          
        System.out.print((c && d) +"\n");          
        System.out.print((d && c) +"\n");          
        System.out.print((e || f) +"\n");          
        System.out.print((f || e) +"\n");          
    }
}