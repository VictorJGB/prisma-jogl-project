package cg;

import javax.swing.JFrame;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class Main 
{
    public static void main(String[] args )
    {
        GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);
        GLCanvas gc = new GLCanvas(cap);
        JoglFrames jf = new JoglFrames();
        gc.addGLEventListener(jf);
        gc.setSize(350,350);

        JFrame frame = new JFrame("PENTAGON PRISM");
        frame.add(gc);
        frame.setSize(500, 400);
        frame.setVisible(true);


    }
}
