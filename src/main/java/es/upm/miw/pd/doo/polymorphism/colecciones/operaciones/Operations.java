package es.upm.miw.pd.doo.polymorphism.colecciones.operaciones;

public abstract class Operations {
    
    protected int operator1;
    protected int operator2;
    protected char operator;

    public Operations(int operator1,int operator2,char operator) {
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operator = operator;
    }

    public void setOperator1(int operator1) {
        this.operator1 = operator1;
    }

    protected abstract int operar();

    @Override
    public String toString() {
        return "[" + operator1 + operator + operator2 + "]";
    }
}