import lombok.Data;

@Data
public class PaintFill {

    enum Color { White , Blue , Black , Red , Green }

    int  metricSize = 4;

    Color [][] screen = new Color[metricSize][metricSize];

    Color [][] newScreen;




    boolean paintFill( Color [][] screen , int rowNumber ,int columnNumber , Color oldColor, Color newColor){


        for(int i = 0; i < screen.length; i++) {

            for(int j = 0; j < screen[0].length; j++){
                screen[i][j] = newColor;
            }
        }
            setNewScreen(screen);
        return true;
    }


    void printNewScreen(Color [][] newScreen) {

        for(int i = 0; i < newScreen.length; i++) {

            for(int k =  0 ; k < newScreen[0].length; k++) {
                System.out.print(newScreen[i][k] + " ");
            }
            System.out.println( " ");
        }

    }

    void printOldScreen( Color [][] oldSreen){

        for(int row = 0; row < oldSreen.length ; row++){

            for(int col = 0; col < oldSreen[0].length; col++){

                System.out.print(oldSreen[row][col]  + "  ");
            }

            System.out.println(" ");
        }
    }


}



