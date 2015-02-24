/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme.core.Actions;

import tellme.core.Person;
import tellme.core.Conversation;

/**
 *
 * @author mad
 */
public class ActionStartConversation implements Action{
    private Person partner;
    @Override
    public void Do(Person person) {
        Conversation conv;
        conv = new Conversation();
        partner.setActiveConversation(conv);
        person.setActiveConversation(conv);
        conv.partakers[0]=person;
        conv.partakers[1]=partner;
        conv.current=person;
        
        person.AddAction(new ActionGreet());
        partner.AddAction(new ActionGreet());
    }

    public ActionStartConversation(Person partner) {
        this.partner = partner;
    }

    
    
    @Override
    public boolean Condition(Person person) {
        return true;
    }
    
}
