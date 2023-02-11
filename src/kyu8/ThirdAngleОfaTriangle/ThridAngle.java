package kyu8.ThirdAngleÎfaTriangle;

public class ThridAngle {
    public static int otherAngle (int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }

    public static void main(String[] args) {
        System.out.println(otherAngle(45, 12));
    }

}
