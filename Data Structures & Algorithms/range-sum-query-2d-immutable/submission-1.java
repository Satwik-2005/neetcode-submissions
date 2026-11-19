class NumMatrix {

    List<List<Integer>> level = new ArrayList<>();

    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++) {
            level.add(new ArrayList<>());

            for(int j=0;j<m;j++)
                level.get(i).add(0);
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int value = matrix[i][j];

                if(i > 0)
                    value += level.get(i - 1).get(j);

                if(j > 0)
                    value += level.get(i).get(j - 1);

                if(i > 0  &&  j > 0)
                    value -= level.get(i - 1).get(j - 1);

                level.get(i).set(j, value);
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = level.get(row2).get(col2);

        if(row1 - 1 >= 0)
            total -= level.get(row1 - 1).get(col2);

        if(col1 - 1 >= 0)
            total -= level.get(row2).get(col1 - 1);

        if(row1 - 1 >= 0  &&  col1 - 1 >= 0)
            total += level.get(row1 - 1).get(col1 - 1);

        return total;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */