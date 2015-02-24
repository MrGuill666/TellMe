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
public class Conversation{
        public Person[] partakers;
        public Person current;
        public Subject topic;

    public Conversation() {
        partakers=new Person[2];
        current=null;
        topic=null;
    }
    
    public void Ask(Person source, Subject about)
    {
        //TODO
    }
    
    public void Tell(Person source, Information information)
    {
        Graphics.Write(information.subject.name+information.statement);
        for(int i=0; i<partakers.length; i++)
        {
            if(partakers[i]!=source)
            {
                
            }
        }
        StepCurrent();
    }
    
    public void Greet(Person source)
    {
        Graphics.Write("Hello!");
        StepCurrent();
    }
    
    private void StepCurrent()
    {
        if(current==partakers[0])
        {
            current=partakers[1];
        }
        else current=partakers[0];
    }
 }
