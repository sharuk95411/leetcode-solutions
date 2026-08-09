
class Solution {
    public void setZeroes(int[][] arr) {

        // These flags remember whether the original first row
        // or first column contained a zero.
        boolean firstRow = false;
        boolean firstCol = false;

        /*
         * Step 1:
         * Use the first row and first column as markers.
         *
         * If arr[i][j] is zero:
         * - arr[i][0] = 0  -> mark the entire row i
         * - arr[0][j] = 0  -> mark the entire column j
         *
         * We need separate flags for the first row and first column
         * because they are also being used as markers.
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 0) {

                    // Remember that the original first row had a zero.
                    if (i == 0) {
                        firstRow = true;
                    }

                    // Remember that the original first column had a zero.
                    if (j == 0) {
                        firstCol = true;
                    }

                    // Mark this row and column using first row/column.
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        /*
         * Step 2:
         * Use the first row as markers for columns.
         *
         * If arr[0][col] == 0, the entire column must become zero.
         *
         * Start from column 1 because column 0 is handled separately
         * using firstCol.
         */
        for (int col = 1; col < arr[0].length; col++) {

            if (arr[0][col] == 0) {

                for (int row = 0; row < arr.length; row++) {
                    arr[row][col] = 0;
                }
            }
        }

        /*
         * Step 3:
         * Use the first column as markers for rows.
         *
         * If arr[row][0] == 0, the entire row must become zero.
         *
         * Start from row 1 because row 0 is handled separately
         * using firstRow.
         */
        for (int row = 1; row < arr.length; row++) {

            if (arr[row][0] == 0) {

                for (int col = 0; col < arr[0].length; col++) {
                    arr[row][col] = 0;
                }
            }
        }

        /*
         * Step 4:
         * If the original first row contained a zero,
         * make the entire first row zero.
         */
        if (firstRow) {

            for (int col = 0; col < arr[0].length; col++) {
                arr[0][col] = 0;
            }
        }

        /*
         * Step 5:
         * If the original first column contained a zero,
         * make the entire first column zero.
         */
        if (firstCol) {

            for (int row = 0; row < arr.length; row++) {
                arr[row][0] = 0;
            }
        }
    }
}

