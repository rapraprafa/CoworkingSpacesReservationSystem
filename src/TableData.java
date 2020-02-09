/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafamus
 */
public class TableData {
    private int table_id;
    private String table_name, table_material, table_size, table_price;
    private boolean available;
    
    public TableData(int table_id, String table_name, String table_material, String table_size, String table_price, boolean available){
        this.table_id = table_id;
        this.table_name = table_name;
        this.table_material = table_material;
        this.table_size = table_size;
        this.table_price = table_price;
        this.available = available;
    }
    
    public int getTableID(){
        return table_id;
    }
    public String getTableName(){
        return table_name;
    }
    public String getTableMaterial(){
        return table_material;
    }
    public String getTableSize(){
        return table_size;
    }
    public String getTablePrice(){
        return table_price;
    }
    public boolean getavailable(){
        return available;
    }
}
