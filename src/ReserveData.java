/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafamus
 */
public class ReserveData {
    private int reservation_id;
    private String customer_name, roomOrtable, item_id, item_name, startdate, enddate, price;
    private boolean paid, done;
    
    public ReserveData(int reservation_id, String customer_name, String roomOrtable, String item_id, String item_name, String startdate, String enddate, String price, boolean paid, boolean done){
        this.reservation_id = reservation_id;
        this.customer_name = customer_name;
        this.roomOrtable = roomOrtable;
        this.item_id = item_id;
        this.item_name = item_name;
        this.startdate = startdate;
        this.enddate = enddate;
        this.price = price;
        this.paid = paid;
        this.done = done;
    }
    
    public int getReservationID(){
        return reservation_id;
    }
    public String getCustomerName(){
        return customer_name;
    }
    public String getRoomOrTable(){
        return roomOrtable;
    }
    public String getItemID(){
        return item_id;
    }
    public String getItemName(){
        return item_name;
    }
    public String getStartDate(){
        return startdate;
    }
    public String getEndDate(){
        return enddate;
    }
    public String getPrice(){
        return price;
    }
    public boolean getPaid(){
        return paid;
    }
    public boolean getDone(){
        return done;
    }
}
