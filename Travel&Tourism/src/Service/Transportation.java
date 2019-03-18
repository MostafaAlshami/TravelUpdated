/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author Mostafa
 */
public abstract class Transportation implements Requests{
     String trans_ID;
    String type;
    enum type
    {
        BUS,
        PLANE, 
        TAXI,
        RENTAL;
    }
    int capacity;
    boolean status;
    Transportation[] list;

    
    
    /*Constructor*/

    public Transportation(String trans_ID, String type, int capacity, boolean status, Transportation[] list) {
        this.trans_ID = trans_ID;
        this.type = type;
        this.capacity = capacity;
        this.status = status;
        this.list = list;
    }
    
    
    
    
    /*Setters & Getters*/
    public String getTrans_ID() {
        return trans_ID;
    }

    public void setTrans_ID(String trans_ID) {
        this.trans_ID = trans_ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Transportation[] getList() {
        return list;
    }

    public void setList(Transportation[] list) {
        this.list = list;
    }
    
    
    
    /*Methods*/
  public Transportation[] search(String x)
{
return getList();
}  
  public void add(String id, String type, int Capacity, boolean state)
  {
      setTrans_ID(id);
      setType(type);
      setCapacity(Capacity);
      setStatus(state);
  }
  public void delete(String id)
  {
      setTrans_ID(null);
      setType(null);
      setCapacity(-1);
      setStatus(false);
  }
   public void reserve(String id)
  {
  }
}
