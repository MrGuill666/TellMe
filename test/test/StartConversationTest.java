package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tellme.core.Actions.ActionGreet;
import tellme.core.Actions.ActionStartConversation;
import tellme.core.Conversation;
import tellme.core.Person;

/**
 *
 * @author mad
 */
public class StartConversationTest {
    
    public StartConversationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void StartConversation()
    {
        Person p1,p2;
        p1=new Person("P1");
        p2=new Person("P2");
        p1.AddAction(new ActionStartConversation(p2));
    }
    
    @Test
    public void Greet()
    {
        Person p1,p2;
        p1=new Person("P1");
        p2=new Person("P2");
        Conversation c=new Conversation();
        p1.activeConversation=c;
        p2.activeConversation=c;
        c.partakers[0]=p1;
        c.partakers[1]=p2;
        c.current=p1;
        p1.AddAction(new ActionGreet());
    }
}
