package es.upm.miw.pd.doo.polymorphism.colecciones.operaciones;

public abstract class Operations {
    
    private int operator1;
    private int operator2;
    private char operator;
    
    public Operations(int operator1,int operator2,char operator){
        this.operator1=operator1;
        this.operator2=operator2;
        this.operator=operator;
    }
    
    protected abstract int operar();
}