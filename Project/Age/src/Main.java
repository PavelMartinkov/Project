public class Main {
    public static void main(String[] args) {

        int vasilAge = 45;
        int kateAge = 17;
        int mishaAge = 17;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasilAge <= kateAge && vasilAge <= mishaAge) {
            System.out.println("Minimal age: " + vasilAge);
        } else if (vasilAge <= kateAge && vasilAge >= mishaAge) {
            System.out.println("Minimal age: " + mishaAge);
        } else if (vasilAge >= kateAge && kateAge <= mishaAge) {
            System.out.println("Minimal age: " + kateAge);
        }

        if (vasilAge >= kateAge && kateAge >= mishaAge) {
            System.out.println("Middle age: " + kateAge);
        } else if (vasilAge >= kateAge && mishaAge >= kateAge) {
            System.out.println("Middle age: " + vasilAge);
        } else if (vasilAge <= kateAge && mishaAge <= kateAge) {
            System.out.println("Middle age: " + mishaAge);
        }

        if (vasilAge >= kateAge && vasilAge >= mishaAge) {
            System.out.println("Maximum age: " + vasilAge);
        } else if (vasilAge >= kateAge && vasilAge <= mishaAge) {
            System.out.println("Maximum age: " +  mishaAge);
        } else if (vasilAge <= kateAge && kateAge >= mishaAge) {
            System.out.println("Maximum age: " +  kateAge);
        }
    }
}
