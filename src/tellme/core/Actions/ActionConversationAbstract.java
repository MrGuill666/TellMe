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
public abstract class ActionConversationAbstract implements Action{

    @Override
    public abstract void Do(Person person);

    @Override
    public boolean Condition(Person person) {
        return person.activeConversation!=null&&person.activeConversation.current==person;
        
    }
    
}
