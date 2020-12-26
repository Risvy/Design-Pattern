public class Subtraction implements Operation {
    private double first, second, subtraction =0;

    public Subtraction (double first, double second)
    {
        this.first= first;
        this.second= second;
    }

    public void setResult(double subtraction)
    {
        this.subtraction= subtraction;
    }
    public double getFirstNumber()
    {
        return this.first;
    }
    public double getSecondNumber()
    {
        return this.second;
    }


}
