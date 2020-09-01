/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;
import java.util.*;
/**
 *
 * @author addav
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Circle(1.0));
        list.add(new Date());
        list.add("String");
        list.add(new Rectangle(2.0, 3.0));
        
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) instanceof Circle){
                System.out.println("The object is a circle and its radius is "+((Circle)list.get(i)).getRadius());
            }
            if(list.get(i) instanceof Date){
                System.out.println("The object is a date and the date is "+((Date)list.get(i)).toString());
            }
            if (list.get(i) instanceof Rectangle){
                System.out.println("The object is a rectangle and its height its height is "+((Rectangle)list.get(i)).getHeight());
            }
        }
    }
    
}
