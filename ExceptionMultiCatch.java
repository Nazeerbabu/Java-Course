public class ExceptionMultiCatch {
        public static void main(String[] args)
        {
            int i=2;
            int j=0;
            int n[]= new int[5];
            try{
                j=18/i;
                System.out.println(n[1]);
                System.out.println(n[5]);

            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            catch(Exception e)
            {
                System.out.println("Parent Exception");
            }
            System.out.println(j);
        }
    }

