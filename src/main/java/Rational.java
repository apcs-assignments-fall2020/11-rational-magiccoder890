public class Rational
{
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b)
    {
        numerator = a;
        denominator = b;
    }
    
    // This method takes two Rationals, add thems up, 
    // and returns a Rational equal to the sum
    public static Rational add(Rational r, Rational s)
    {
        int newNumerator = r.numerator*s.denominator + s.numerator*r.denominator;
        int newDenominator = r.denominator*s.denominator; 
        
        Rational x = new Rational(newNumerator, newDenominator);
        x = simplify(x);
        return x;
    }

    // Finds the greatest common factor between a and b
    public static int greatestCommonFactor(int a, int b){
        int gcd = 1;

        int k = Math.max(a, b);
        
        for(int i = 1; i <= k; i ++){
            if (a%i == 0 && b%i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // e.g. simplify(2/4) => 1/2
    //      simplify(1/2) => 1/2
    public static Rational simplify(Rational r)
    {
        // REPLACE WITH YOUR CODE HERE
        int gcd = greatestCommonFactor(r.numerator, r.denominator);
        int numerator = r.numerator/gcd;
        int denominator = r.denominator/gcd;
        Rational answer = new Rational(numerator, denominator);
        return answer;
    }

    // This method takes two Rationals, subtracts thems up, 
    // and returns a Rational equal to the difference
    public static Rational subtract(Rational r, Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        int answer_denominator = (r.denominator * s.denominator);
        int new_r_numerator = (r.numerator * s.denominator);
        int new_s_numerator = (s.numerator * r.denominator);
        Rational answer = new Rational(new_r_numerator - new_s_numerator,r.denominator*s.denominator);
        answer = simplify(answer);
        return answer;
    }
    
    public static Rational multiply(Rational r, Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        int answer_numerator = (r.numerator * s.numerator);
        int answer_denominator = (r.denominator * s.denominator);
        Rational answer = new Rational(answer_numerator,answer_denominator);
        answer = simplify(answer);
        return answer;
    }
    
    public static Rational divide(Rational r, Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        int answer_numerator = (r.numerator * s.denominator);
        int answer_denominator = (r.denominator * s.numerator);
        Rational answer = new Rational(answer_numerator,answer_denominator);
        answer = simplify(answer);
        return answer;
    }



    // These following methods are NOT static, we'll talk about them next class!
    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }


    public Rational add(Rational s)
    {
        int answer_denominator = (this.denominator * s.denominator);
        int new_r_numerator = (this.numerator * s.denominator);
        int new_s_numerator = (s.numerator * this.denominator);
        Rational answer = new Rational(new_r_numerator + new_s_numerator,this.denominator*s.denominator);
        answer = simplify(answer);
        return answer;
        // REPLACE WITH YOUR CODE HERE
        
    }
    
    public Rational subtract(Rational s)
    {
        int answer_denominator = (this.denominator * s.denominator);
        int new_r_numerator = (this.numerator * s.denominator);
        int new_s_numerator = (s.numerator * this.denominator);
        Rational answer = new Rational(new_r_numerator - new_s_numerator,this.denominator*s.denominator);
        answer = simplify(answer);
        return answer;
        // REPLACE WITH YOUR CODE HERE
        
    }
    
    public Rational multiply(Rational s)
    {
        int answer_numerator = (this.numerator * s.numerator);
        int answer_denominator = (this.denominator * s.denominator);
        Rational answer = new Rational(answer_numerator,answer_denominator);
        answer = simplify(answer);
        return answer;
        // REPLACE WITH YOUR CODE HERE
        
    }
    
    public Rational divide(Rational s)
    {int answer_numerator = (this.numerator * s.denominator);
        int answer_denominator = (this.denominator * s.numerator);
        Rational answer = new Rational(answer_numerator,answer_denominator);
        answer = simplify(answer);
        return answer;
        // REPLACE WITH YOUR CODE HERE
        
    }
}













