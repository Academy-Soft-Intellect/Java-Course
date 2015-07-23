
public class MatrixSpiral {
public static void main(String[] args){
		
		int n = 6;
		
		int[][] matrix = new int[n][n];
		
		int positionX = 0;
        int positionY = 0;
 
        int direction = 0; // The initial direction is "right"
        int stepsCount = n - 1; // Initially perform N-1 step in current direction
        int stepPosition = 0; // 0 steps already performed
        int stepChange = -1; // Steps count changes after 2 steps and one extra
 
        for (int i = 0; i < n * n; i++)
        {
            // Fill the current cell with the current value
            matrix[positionY][positionX] = i;
 
            // Check for direction / step changes
            if (stepPosition < stepsCount)
            {
                stepPosition++;
            }
            else
            {
                stepPosition = 1;
                if (stepChange == 1){
                    stepsCount--;
                }
                stepChange = (stepChange + 1) % 2;
                direction = (direction + 1) % 4;
            }
 
            // Move to the next cell in the current direction
            switch (direction)
            {
            	case 0: // RIGHT
            		positionX++;
            		break;
                case 1: // DOWN
                    positionY++;
                    break;
                case 2: // LEFT
                    positionX--;
                    break;
                case 3: // UP
                    positionY--;
                    break;

            }
        }
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
