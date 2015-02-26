/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tellme.core.Actions.Action;

/**
 *
 * @author mad
 */
public class Person extends Subject implements Steppable {

    List<Information>[] knowledge;

    List<Action> actions;

    public void setKnowledge(List<Information>[] knowledge) {
        this.knowledge = knowledge;
    }

    public void setRelations(HashMap<Person, Relation> relations) {
        this.relations = relations;
    }

    public void setPlace(Room place) {
        this.place = place;
    }

    @Override
    public void Step() {
        if (!actions.isEmpty()&&actions.get(0).Condition(this)) {
            actions.remove(0).Do(this);
        }
    }

    private class Relation {

        Person with;
        int level;
    }

    public void AddAction(Action action) {
        actions.add(action);
    }

    public void ClearActions() {
        actions.clear();
    }

    public Conversation activeConversation = null;
    public Conversation pendingConversation = null;

    HashMap<Person, Relation> relations;

    public Person(String name) {
        this.relations = new HashMap<>();
        this.knowledge = new ArrayList[5];
        this.actions = new ArrayList();
        this.name=name;
    }

}
