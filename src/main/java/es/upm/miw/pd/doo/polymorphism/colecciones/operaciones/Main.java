package es.upm.miw.pd.doo.polymorphism.colecciones.operaciones;

public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.add(new Adittion(3, 4));

        System.out.println("Total1:" + operations.total());

        operations.add(new Subtraction(1, 1));
        operations.add(new Adittion(3, 5));
        operations.add(new Subtraction(4, 1));
        operations.add(new Adittion(3, 6));
        operations.add(new Subtraction(3, 2));

        System.out.println("Total2:" + operations.total());
    }

}
