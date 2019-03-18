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
public abstract class Hotel implements Requests{
    
    String hotel_ID;
    int stars;
    String description;
    boolean booked;
    Hotel[] list;

    
    
    /*Constructor*/

    public Hotel(String trans_ID, int stars, int capacity, String description, boolean booked) {
        this.hotel_ID = trans_ID;
        this.stars = stars;
        this.description = description;
        this.booked = booked;
    }

  public String getHotel_ID()
{
return  hotel_ID;
}  

    public void setHotel_ID(String hotel_ID) {
        this.hotel_ID = hotel_ID;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Hotel[] getList() {
        return list;
    }

    /*Setters & Getters*/
    public void setList(Hotel[] list) {
        this.list = list;
    }

    /*Methods*/
    public Hotel[] search(String x) {
        return getList();
    }
  public void add(String id, int stars, String description, boolean state)
  {
      setHotel_ID(id);
      setStars(stars);
      setDescription(description);
      setBooked(state);
  }
  public void delete(String id)
  {
      setHotel_ID(null);
      setDescription(null);
      setStars(-1);
      setBooked(false);
  }
   public void reserve(String id)
  {
  }

    
}
