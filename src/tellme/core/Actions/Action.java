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
public interface Action {
    public void Do(Person person);
    public boolean Condition(Person person);
}
