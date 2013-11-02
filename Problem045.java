/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Manan
 */
public class Problem045 {
    public static void euler045()
    {
        for(int n=285; n<100000000; n++)
        {
            if(getTriangleNum(n)==getPentagonalNum(n) && getTriangleNum(n)==getHexagonalNum(n)) 
            {
                System.out.println(getTriangleNum(n));
                return;
            }
            //System.out.println("NOT EQUAL " + getTriangleNum(n));
        }
        /*
         * Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
         * 
         *  Triangle	 	Tn=n(n+1)/2	 	1, 3, 6, 10, 15, ...
         *  Pentagonal	 	Pn=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
         *  Hexagonal	 	Hn=n(2n−1)	 	1, 6, 15, 28, 45, ...
         *  
         * It can be verified that T285 = P165 = H143 = 40755.
         * 
         * Find the next triangle number that is also pentagonal and hexagonal.
         */
        
        
    }
    public static long getTriangleNum(int n)
    {
        return ((long)n*(n+1))/2;
    }
    public static long getPentagonalNum(int n)
    {
        return ((long)n*((3*n)-1))/2;
    }
    public static long getHexagonalNum(int n)
    {
        return ((long)n*(((2*n) - 1)));
    }
}
