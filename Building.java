

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




		int windowRows = (int)(Math.random()*21); //random number of rows
        int windowWidth = (int)(Math.random()*20); //random width of windows

        int windowColumns = (int)(Math.random()*20); //random number of columns
        int windowHeight = (int)(Math.random()*30); //random height of windows

        int windowSpacing = (int)(Math.random()*6); //random spacing distance

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

}
