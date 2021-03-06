/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme.core.Actions;

import tellme.core.Person;

/**
 *
 * @author mad
 */
public class ActionGreet implements Action {

    @Override
    public void Do(Person person) {
        if (person.activeConversation == null && person.pendingConversation != null) {
            person.activeConversation = person.pendingConversation;
            person.pendingConversation = null;
            person.activeConversation.Greet(person);
        }
    }

    @Override
    public boolean Condition(Person person) {
       return true;
    }

}
