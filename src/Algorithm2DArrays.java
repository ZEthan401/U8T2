import java.util.ArrayList;

public class Algorithm2DArrays
{
    public class Algorithm2DArrays
    {
        /** Return true if target is found in the 2D array arr, false otherwise.
         *  For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
         *  and target is 5, this method returns true. If target is 15, returns false
         *
         *  @param arr  2D array of ints
         *  @param target  target value to be searched for in arr
         *  @return  true if target is found at least once in arr; false otherwise
         */
        public static boolean isFound(int[][] arr, int target)
        {
            for (int[] row : arr)
            {
                for (int val : row)
                {
                    if (val == target)
                    {
                        return true;
                    }
                }
            }
        return false;
    }

        public static int countElementsWithSubstring(String[][] arr, String searchStr)

        {
            int count = 0;

            for (String[] row : arr)
            {
                for (String str : row)
                {
                    if (str.indexOf(searchStr) != -1)
                    {
                        count++;
                    }
                }
            }
            return count;
        }

        public static int replaceEvensWithZero(int[][] arr)
        {
            int changes = 0;

            for (int row = 0; row < arr.length; row++)
            {
                for (int col = 0; col < arr[0].length; col++)
                {
                    int element = arr[row][col];

                    if (element % 2 == 0)
                    {
                        arr[row][col] = 0;
                        changes++;
                    }
                }
            }
            return changes;
        }
    }
    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;

        for (int col = 0; col < arr[0].length; col++)
        {
            sum += arr[row][col];
        }
        return sum;
    }


    public static int sumForColumn(int[][] arr, int col)
        {
            int sum = 0;

            for (int row = 0; row < arr.length; row++)
            {
                sum += arr[row][col];
            }
            return sum;
        }

        public static int[][] printNumberGrid(int rows, int cols)
        {
            int[][] numGrid = new int[rows][cols];

            int counter = 0;

            for (int row = 0; row < rows; row++)
            {
                for (int col = 0; col < cols; col++)
                {
                    numGrid[row][col] = counter;

                    System.out.print(numGrid[row][col] + " ");

                    counter++;
                }
                System.out.println();
            }
            return numGrid;
        }

        public static String[][] gridOfXandO(int n)
        {
            String[][] XOgrid = new String[n][n];

            for (int row = 0; row < n; row++)
            {
                for (int col = 0; col < n; col++)
                {
                    if ((row + col) % 2 == 0)
                    {
                        XOgrid[row][col] = "X";
                    }
                    else
                    {
                        XOgrid[row][col] = "O";
                    }
                }
            }
            return XOgrid;
        }

        public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
        {
            ArrayList<String> returnList = new ArrayList<String>();

            for (String[] row : wordChart)
            {
                for (String str : row)
                {
                    if (str.length() == len)
                    {
                        returnList.add(str);
                    }
                }
            }
            return returnList;
        }
    }
