import java.awt.*;
import java.applet.*;
/*
<applet code="smiley" width=300 height=500>
</applet>
*/
public class smiley extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,120,150); //head
g.drawOval(57,75,30,20);   //lefteye
g.drawOval(110,75,30,20);  //righteye
g.fillOval(68,81,10,10);   //pupil(lefteye)
g.fillOval(121,81,10,10);  //pupil(righteye)
g.drawOval(85,100,30,30);  //nose
g.fillArc(60,125,80,40,180,180); //mouth
g.drawOval(25,92,15,30);  //leftear
g.drawOval(160,92,15,30); //rightear
}
}