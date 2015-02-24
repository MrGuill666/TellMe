/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme;

import tellme.core.Actions.ActionStartConversation;
import tellme.core.Person;

/**
 *
 * @author mad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1,p2;
        p1=new Person();
        p2=new Person();
        p1.AddAction(new ActionStartConversation(p2));
        p1.Step();
        p2.Step();
        p1.Step();
        p2.Step();
    }
    
}
