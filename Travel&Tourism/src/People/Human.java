/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author Mostafa
 */
public class Human {
    
    private String Name;
    private String User_Name;
    private String SocialID;
    private boolean Position;   
    private int Age;
    private String Nationality;

    
    public Human()
    {
        Name="";
        User_Name="";
        SocialID="";
        Position=false;
        Age=0;
        Nationality="";
    } 
    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getUser_Name()
    {
        return User_Name;
    }

    public void setUser_Name(String User_Name)
    {
        this.User_Name = User_Name;
    }

    public String getSocialID()
    {
        return SocialID;
    }

    public void setSocialID(String SocialID)
    {
        this.SocialID = SocialID;
    }

    public boolean isPosition()
    {
        return Position;
    }

    public void setPosition(boolean Position) 
    {
        this.Position = Position;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public String getNationality()
    {
        return Nationality;
    }

    public void setNationality(String Nationality)
    {
        this.Nationality = Nationality;
    }
    
    
    
}
