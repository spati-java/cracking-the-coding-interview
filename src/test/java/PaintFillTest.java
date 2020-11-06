import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class PaintFillTest {

    PaintFill paintFill ;

    @BeforeEach
    public void init(){
        paintFill = new PaintFill();
        PaintFill.Color [][] oldScreen = new PaintFill.Color[5][5];

        for(int i = 0; i < oldScreen.length; i++){
            for(int j = 0; j < oldScreen[0].length; j++){
                oldScreen[i][j] = PaintFill.Color.Black;
            }
        }

        paintFill.setScreen(oldScreen);
    }


    @Test
    void paintFill() {

        boolean expected = true;

        System.out.println("OldScreen looks like this " );

        paintFill.printOldScreen(paintFill.getScreen());

        boolean actual = paintFill.paintFill( paintFill.getScreen(), 4, 4 , PaintFill.Color.Black, PaintFill.Color.Green);

        System.out.println( "new Screen looks like this ");

        paintFill.printNewScreen(paintFill.getNewScreen());

        assertEquals(expected, actual);

    }


}