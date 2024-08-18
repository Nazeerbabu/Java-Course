public class MultiDimensional{
    public static void main(String[] args)
    {
        double n[][]=new double[4][4];

        for(int i=0;i<4;i++)
        {
           for(int j=0;j<4;j++)
           {
              n[i][j]=Math.random()*10;
           }
        }
    
      for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
   System.out.print(n[i][j] );
            }
         
        }

    }
}
