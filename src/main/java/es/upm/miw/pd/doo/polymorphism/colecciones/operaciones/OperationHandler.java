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
      int result = 0;
      for (int i = 0; i < operations.size(); i++) {
          result += operations.get(i).operar();
      }
     System.out.print(">>> ");
     return result;
  }
}
