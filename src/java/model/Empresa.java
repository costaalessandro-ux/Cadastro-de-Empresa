package model;

public class Empresa {
    
    private int id;
    private String name; 
    
    public Empresa(){
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
