package org.example.NewDrawingSys;

import org.example.NewDrawingSys.oldDrawingSys.Rectangle;

public class RectangleAdapter extends Rectangle implements Shape {
    @Override
    public void draw(int a, int b, int c, int d){
        super.draw(a,b,c,d);
    }
}
