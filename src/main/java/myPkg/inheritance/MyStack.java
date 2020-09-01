/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmystack;

import java.util.*;

/**
 *
 * @author addav
 */
public class MyStack extends ArrayList{
    private ArrayList<Object> list;
    
    @Override
    public boolean isEmpty(){
        return super.size() == 0;
    }
    
    public int getSize(){
        return super.size();
    }
    
    public Object peek(){
        return super.get(getSize()-1);
    }
    
    public Object pop(){
        Object a = super.get(getSize()-1);
        super.remove(getSize()-1);
        return a;
    }
    
    public void push(Object a){
        super.add(a);
    }
    
    @Override
    public String toString(){
        return "Stack: "+super.toString();
    }
}
