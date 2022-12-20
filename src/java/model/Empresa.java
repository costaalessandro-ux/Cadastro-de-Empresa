 package model;

import java.util.Date;

public class Empresa {
    
    private int id;
    private String name; 
    private Date dataAbertura = new Date();
    
    public Empresa(){
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Date getDataAbertura(){
        return dataAbertura;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
 
    public void setDataAbertura(Date dataAbertura){
        this.dataAbertura = dataAbertura;
    }
    
    
}
