package cg;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;

public class JoglFrames implements GLEventListener{

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
            gl.glBegin(GL2.GL_LINES);

            // BASE RECTANGLE COORDINATES

                // first vertical line
                gl.glVertex2d(0, 0);
                gl.glVertex2d(0, 0.5);

                // second vertical line
                gl.glVertex2d(0.25, 0);
                gl.glVertex2d(0.25, 0.5);

                // bottom horizontal line 
                gl.glVertex2d(0, 0);
                gl.glVertex2d(0.25, 0);

                // top horizontal line 
                gl.glVertex2d(0, 0.5);
                gl.glVertex2d(0.25, 0.5);

            // TOP LEFT DIAGONAL COORDINATES

                // top left diagonal line 
                gl.glVertex2d(0, 0.5);
                gl.glVertex2d(-0.1, 0.6);

                // vertical line 
                gl.glVertex2d(-0.1, 0.6);
                gl.glVertex2d(-0.1, 0.1);

                // bottom left diagonal line 
                gl.glVertex2d(-0.1, 0.1);
                gl.glVertex2d(0, 0.0);

            // TOP RIGHT DIAGONAL COORDINATES

                // top right diagonal line 
                gl.glVertex2d(0.25, 0.5);
                gl.glVertex2d(0.35, 0.6);

                // vertical line 
                gl.glVertex2d(0.35, 0.6);
                gl.glVertex2d(0.35, 0.1);

                // bottom right diagonal line 
                gl.glVertex2d(0.35, 0.1);
                gl.glVertex2d(0.25, 0.0);

            // TOP PENTAGON

                // left diagonal
                gl.glVertex2d(-0.1, 0.6);
                gl.glVertex2d(0.13, 0.7);

                // right diagonal
                gl.glVertex2d(0.35, 0.6);
                gl.glVertex2d(0.12, 0.7);

            gl.glEnd();
        
    }

    @Override
    public void dispose(GLAutoDrawable arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        
    }

    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // TODO Auto-generated method stub
        
    }
    
}
