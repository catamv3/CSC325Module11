package org.example.NewDrawingSys;

import org.example.NewDrawingSys.oldDrawingSys.Circle;

public class CircleAdapter extends Circle implements Shape{

    @Override
    public void draw(int a, int b, int c, int d) {
        super.draw(a,b,c);
    }
}
