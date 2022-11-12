

import math.shapes.*;



public class prob1 {

    public static void main(String[] args)
    {
        shapes s1 = new shapes();
        s1.set_for_rectangle(4,4);
        s1.rect_Area();

        s1.set_for_cuboid(4,5,6);
        s1.cuboid_volume();


        s1.set_for_square(10);
        s1.square_Area();
        s1.cube_volume();

    }
}
