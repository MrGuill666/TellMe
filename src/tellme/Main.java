/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme;

import tellme.core.Actions.ActionBye;
import tellme.core.Actions.ActionGreet;
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
        p1=new Person("P1");
        p2=new Person("P2");
        p2.AddAction(new ActionGreet());    //Köszönés, de nincs kinek
        p2.Step();                          //Nem is kerül feldolgozásra
        p1.AddAction(new ActionStartConversation(p2));  //Itt jön létre a beszélgetésre igény
        p1.Step();  //Létrejön a beszélgetés
        p2.Step();  //Semmi
        p2.AddAction(new ActionGreet()); //p2 be akar csatlakozni
        p1.Step();  //P1 köszönés
        p2.Step();  //P2 köszönés
        p2.AddAction(new ActionBye()); //Beszélgetés bontásra igény
        p1.Step();  //Semmi
        p2.Step();  //Beszélgetés bontás
        
        
    }
    
}
