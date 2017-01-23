

import java.awt.*;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {

    private int xcoord;
    private int ycoord;

    public Building(int x, int y)
    {
       xcoord = x;
       ycoord = y;
    }
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		this.setBackground(Color.WHITE);


        final int ROW_CONSTANT = 20;
        final int WINDOW_WIDTH_CONSTANT = 20;
        final int COLUMN_CONSTANT = 20;
        final int WINDOW_HEIGHT_CONSTANT = 30;
        final int WINDOW_SPACING_CONSTANT = 6;

		int windowRows = getRandomNumber(5); //random number of rows
        int windowWidth = getRandomNumber(4); //random width of windows

        int windowColumns = getRandomNumber(COLUMN_CONSTANT); //random number of columns
        int windowHeight = getRandomNumber(WINDOW_HEIGHT_CONSTANT); //random height of windows

        int windowSpacing = getRandomNumber(WINDOW_SPACING_CONSTANT); //random spacing distance

        //Height and width are based on the random window numbers above
        int buildingWidth = (windowSpacing) + (windowSpacing * windowColumns) + (windowWidth * windowColumns);
        int buildingHeight = (windowSpacing) + (windowSpacing * windowRows)+ (windowHeight * windowRows);

            //draw building
            g.drawRect(xcoord, ycoord, buildingWidth, buildingHeight);

            int n = 0;
            int rowCount = ycoord + windowSpacing;
            int columnCount = xcoord + windowSpacing;

            for (n = 1; n < windowRows; n++)
            {
                int x = 0;
                for (x = 0; x < windowColumns; x++)
                {
                    g.fillRect(columnCount, rowCount, windowWidth, windowHeight);
                    columnCount += windowSpacing + windowWidth;
                }
                columnCount = xcoord + windowSpacing;
                rowCount += windowSpacing + windowHeight;
            }

	}

	static int getRandomNumber(int max)
    {
        final int PERCENT = 100;
        final int MIN  = 1;

        int num = 0;
        while(num == 0) num = (int)Math.random() * PERCENT;

        return(num % max) + MIN;

    }

}
