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
public class ActionGreet extends ActionConversationAbstract{

    @Override
    public void Do(Person person) {
        person.getActiveConversation().Greet(person);
    }
    
}
