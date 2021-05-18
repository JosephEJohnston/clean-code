package ch2;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/18
 */
public class Main6 {
  {
    int s = 0;
    int[] t = new int[34];

    for (int j=0; j<34; j++) {
      s += (t[j]*4)/5;
    }
  }

  private final int NUMBER_OF_TASKS = 34;
  private final int[] taskEstimate = new int[34];

  {
    int realDaysPerIdealDay = 4;
    int WORK_DAYS_PER_WEEK = 5;
    int sum = 0;
    for (int j = 0; j < NUMBER_OF_TASKS; j++) {
      int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
      int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
      sum += realTaskWeeks;
    }
  }
}
