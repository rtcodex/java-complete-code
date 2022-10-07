import java.util.*;
class code_platform implements Comparable<code_platform>{
    int id;
    String name,author,founder;
    int quantity;
    public code_platform(int id, String name, String founder,int quantity){
        this.id = id;
        this.name= name;
        this.founder= founder;
        this.quantity= quantity;
    }
    public int compareTo(code_platform b){
        if(id>b.id){
            return 1;
        }
        else if(id<b.id){
            return -1;
        }
        else{
            return 0;
    }
    }
}

class TreeSetExample{
    public static void main(String[] args){
        Set<code_platform> set = new TreeSet<code_platform>();
        code_platform b1 = new code_platform(2," Hackerearth"," Alice",8);
        code_platform b2 = new code_platform(1," Hacker"," Bob",6);
        code_platform b3 = new code_platform(3," Hacker_earth"," Mike",4);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for(code_platform b:set){
            System.out.println(b.id+""+b.name+""+b.founder+""+b.quantity);
        }
        
    }
}