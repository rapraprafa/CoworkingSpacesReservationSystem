/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafamus
 */
public class RoomData {
    private int room_id;
    private String room_name, room_location, room_size, room_price;
    private boolean available;
    
    public RoomData(int room_id, String room_name, String room_location, String room_size, String room_price, boolean available){
        this.room_id = room_id;
        this.room_name = room_name;
        this.room_location = room_location;
        this.room_size = room_size;
        this.room_price = room_price;
        this.available = available;
    }
    
    public int getRoomID(){
        return room_id;
    }
    public String getRoomName(){
        return room_name;
    }
    public String getRoomLocation(){
        return room_location;
    }
    public String getRoomSize(){
        return room_size;
    }
    public String getRoomPrice(){
        return room_price;
    }
    public boolean getavailable(){
        return available;
    }
}
