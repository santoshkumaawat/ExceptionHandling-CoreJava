
public class TryCatchFinally {

    //for run this program pass two integer value in cmd ling arguments..
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x + y;
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception Occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Occured");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured");
        } catch (Exception e) {
            System.out.println("Unknown Error");
        } finally {
            System.out.println("INSIDE FINALLY BLOCK");
        }

        System.out.println("Addition : " + z);
        System.out.println("End Of Main");
    }
}
