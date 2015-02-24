/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mad
 */
public class Room {
    String name;
    List<Room> connectedRooms;

    public void setConnectedRooms(List<Room> connectedRooms) {
        this.connectedRooms = connectedRooms;
    }

    public void setSubjectsInside(List<Subject> subjectsInside) {
        this.subjectsInside = subjectsInside;
    }
    List<Subject> subjectsInside;

    public Room(String name) {
        this.name = name;
        this.connectedRooms = new ArrayList<>();
        this.subjectsInside = new ArrayList<>();
    }
    
  
}
