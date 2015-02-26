/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme.core;

/**
 *
 * @author mad
 */
public class Conversation {

    public Person[] partakers;
    public Person current;
    public Subject topic;

    public Conversation() {
        partakers = new Person[2];
        current = null;
        topic = null;
    }

    public void Ask(Person source, Subject about) {
        for (Person p : partakers) {
            if (p != source) {
                p.AddAction(null);
            }
        }
    }

    public void Answer(Person source) {

    }

    public void Tell(Person source, Information information) {
        Graphics.Write(information.subject.name + information.statement);
        for (int i = 0; i < partakers.length; i++) {
            if (partakers[i] != source) {

            }
        }
        StepCurrent();
    }

    public void Greet(Person source) {
        Graphics.Write(source.name+" says: "+"Hello!");
        StepCurrent();
    }
    

    private void StepCurrent() {
        if (current == partakers[0]) {
            current = partakers[1];
        } else {
            current = partakers[0];
        }
    }
    
    public void EndConversation()
    {
        Graphics.Write("Conversation ended.");
        for(Person p: partakers)
        {
        if(p.pendingConversation==this)
        {
            p.pendingConversation=null;
        }
        else
            p.activeConversation=null;
        }
        for(int i=0; i<partakers.length; i++)
        {
            partakers[i]=null;
        }
    }
}
