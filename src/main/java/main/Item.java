package main;
public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String itemName,int mrpItem){
        //write your code here
    	//-------------------
    	this.itemName=itemName;
    	this.mrp=mrpItem;
    	Item i = new Item();
    	i.setItemName( "To kill a mockingbird");
    	i.setMrp(40);
    	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	
    
}