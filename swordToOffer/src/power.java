public class power {
    public double Power(double base, int exponent) {
        double result = 1.0;
    	double temp = base;
        int n = exponent;
        if(base == 0)
            return 0;
        if(exponent == 0){
           return 1;
        } else if(exponent < 0){
            n = -exponent;
        }
        while(n!=0)
        {
            if((n&1) != 0)
            {
                result *= temp;
            }
            temp *= temp;
            n = n >> 1;
        }
        return exponent>0?result:1/result;
            
        
  	}
}