package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            if (firstSide + secondSide > thirdSide &&
                    secondSide + thirdSide > firstSide &&
                    firstSide + thirdSide > secondSide) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        } else {
            System.out.println("it's not a triangle");
        }
    }
}