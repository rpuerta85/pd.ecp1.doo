package es.upm.miw.pd.doo.polymorphism.colecciones.operaciones;

public class Addition extends Operations {

    private static final char OPERATOR = '+';

    public Addition(final int operator1, final int operator2) {
        super(operator1, operator2, OPERATOR);
    }

    @Override
    protected int operar() {
        return this.operator1 + this.operator2;
    }
}
