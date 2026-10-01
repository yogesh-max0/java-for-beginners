package oops.encapsulation;

class lists{
    // private
    private String names;
    
    // setting the variable to access
    public void setlist(String names){
        this.names = names;
    }
    
    // make getter to acces the encapsulation
    public String getlist(){
        return names;
    }
}

public class encapsule_with_set_get{
    public static void main(String[] args) {
        lists l = new lists();

        l.setlist("yogesh");
        System.out.println(l.getlist());
    }
}