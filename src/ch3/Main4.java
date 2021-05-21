package ch3;

import ch3.other4.Employee;
import ch3.other4.InvalidEmployeeType;
import ch3.other4.Money;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/20
 */
public class Main4 {
  private static final int COMMISSIONED = 1;
  private static final int HOURLY = 2;
  private static final int SALARIED = 3;

  // code 3-4
  public Money calculatePay(Employee e)
    throws InvalidEmployeeType {
    switch (e.type) {
      case COMMISSIONED:
        return calculateCommissionedPay(e);
      case HOURLY:
        return calculateHourlyPay(e);
      case SALARIED:
        return calculateSalariedPay(e);
      default:
        throw new InvalidEmployeeType(e.type);
    }
  }

  private Money calculateSalariedPay(Employee e) {
    return null;
  }

  private Money calculateHourlyPay(Employee e) {
    return null;
  }

  private Money calculateCommissionedPay(Employee e) {
    return null;
  }

  // code 3-5
  /*
  private abstract class Employee {

    public int type;

    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
  }

  private interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
  }

  private class EmployeeFactoryImpl implements EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r)
        throws InvalidEmployeeType {
      switch (r.type) {
        case COMMISSIONED:
          return calculateCommissionedPay(r);
        case HOURLY:
          return calculateHourlyPay(r);
        case SALARIED:
          return calculateSalariedPay(r);
        default:
          throw new InvalidEmployeeType(r.type);
      }
    }
  }
  */
}
