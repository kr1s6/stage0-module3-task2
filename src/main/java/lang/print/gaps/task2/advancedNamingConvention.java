package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int ADULT_AGE = 18;
    private int age;
    private int phoneNumber;

    void callToFriend() {
        System.out.println(phoneNumber + age);
    }

    void callByNumber(int number) {
        System.out.println(number + ADULT_AGE);
    }
}
