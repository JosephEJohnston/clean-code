package ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/18
 */
public class Main2 {

  /*private List<int[]> theList = new ArrayList<>();

  public List<int[]> getThem() {
    List<int[]> list1 = new ArrayList<>();
    for (int[] x : theList)
      if (x[0] == 4)
        list1.add(x);

    return list1;
  }


  private List<int[]> gameBoard = new ArrayList<>();
  private final int STATUS_VALUE = 0;
  private final int FLAGGED = 4;

  public List<int[]> getFlaggedCells() {
    List<int[]> flaggedCells = new ArrayList<>();

    for (int[] cell : gameBoard) {
      if (cell[STATUS_VALUE] == FLAGGED)
        flaggedCells.add(cell);
    }

    return flaggedCells;
  }*/

  private final List<Cell> gameBoard = new ArrayList<>();

  public List<Cell> getFlaggedCells() {
    List<Cell> flaggedCells = new ArrayList<>();

    for (Cell cell : gameBoard) {
      if (cell.isFlagged())
        flaggedCells.add(cell);
    }

    return flaggedCells;
  }

  private class Cell {
    private final int[] cell;
    private final int STATUS_VALUE = 0;
    private final int FLAGGED = 4;

    private Cell(int[] cell) {
      this.cell = cell;
    }

    public boolean isFlagged() {
      return cell[STATUS_VALUE] == FLAGGED;
    }
  }
}
