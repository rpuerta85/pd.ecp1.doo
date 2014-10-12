package es.upm.miw.pd.doo.polymorphism.colecciones.operaciones;

import java.util.ArrayList;
import java.util.List;

public class OperationHandler {

  private List<Operations> operations = new ArrayList<Operations>();

  public void add(Operations operation) {
      operations.add(operation);
  }

  public void reset() {
     operations.clear();
  }
  public int total() {
      String separator = "";
      int result = 0;

      for (Operations operation : operations) {
          result += operation.operar();
          System.out.print(separator + operation.toString());
          separator = "+";
      }
     System.out.print(">>> ");
     return result;
  }
}
