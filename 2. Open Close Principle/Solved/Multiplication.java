public class Multiplication implements Operation{
    private double first,second, result=0;
    
    private Multiplication (double first, double second)
    {
        this.first= first;
        this.second= second;
    }
    private void setResult (double result)
    {
        this.result= result;
    }

    private double getFirstNumber()
    {
        return this.first;
    }
    private double getSecondNumber()
    {
        return this.second;
    }
    @Override
    public void performCalculation() {
        
        result=first * second;
    }
}
