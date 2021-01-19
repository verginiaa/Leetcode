public class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] temp = new int[cells.length];
        temp[0] = 0;
        temp[7] = 0;
        while (N-- > 0) {
            for (int i = 1; i < cells.length - 1; i++) {
                if ((cells[i - 1] == 0 && cells[i + 1] == 0) || (cells[i - 1] == 1 && cells[i + 1] == 1)) {
                    temp[i] = 1;
                } else
                    temp[i] = 0;
            }
            for (int i = 0; i < cells.length; i++) {
                cells[i] = temp[i];
            }
        }
        return cells;
    }
}
