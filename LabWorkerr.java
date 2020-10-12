package Prabhu_Sir;


import java.util.ArrayList;
import java.util.List;

	public abstract class Labworkerr {
    protected String Name;
    protected String Position;
  
    Labworkerr() {
      
    }

    public String getPosition() {
        return Position;
    }

    public String getName() {
        return Name;
    }


    protected void setName(String Name) {
        this.Name = Name;
    }

    protected void setPosition(String Position) {
        this.Position = Position;
    }

    final void Welcome() {
    	System.out.println("****** I'll Welcome U **********");
    }
    public abstract void viewDetails();


}
