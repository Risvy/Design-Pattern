public class Addition implements Operation {
    private double first, second, sum =0;

    public Addition (double first, double second)
    {
        this.first= first;
        this.second= second;
    }
    public void setResult(double sum)
    {
        this.sum= sum;
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
