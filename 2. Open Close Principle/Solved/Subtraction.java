public class Subtraction implements Operation {
    private double first,second, result=0;
    private Subtraction (double first, double second)
    {
        this.first= first;
        this.second= second;
    }
   
    private void setResult(double subtraction)
    {
        this.result= subtraction;
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
        result= first- second;
    }


}
