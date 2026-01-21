class ComplexNumber {
    // Properties
    public float real;
    public float imaginary;

    // 1. FIX: The Constructor (This was missing!)
    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // 2. FIX: Argument is (ComplexNumber x), not (float, float)
    public ComplexNumber add(ComplexNumber x) {
        float newReal = this.real + x.real;
        float newImaginary = this.imaginary + x.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber subtract(ComplexNumber x) {
        float newReal = this.real - x.real;
        float newImaginary = this.imaginary - x.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber x) {
        // Formula: (ac - bd) + (ad + bc)i
        float newReal = (this.real * x.real) - (this.imaginary * x.imaginary);
        float newImaginary = (this.real * x.imaginary) + (this.imaginary * x.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    // 3. FIX: Removed the duplicate "public ComplexNumber divide..." line inside
    public ComplexNumber divide(ComplexNumber x) {
        // Denominator = c^2 + d^2
        float denominator = (x.real * x.real) + (x.imaginary * x.imaginary);
        
        // Formula: ((ac + bd) / denom) + ((bc - ad) / denom)i
        float newReal = ((this.real * x.real) + (this.imaginary * x.imaginary)) / denominator;
        float newImaginary = ((this.imaginary * x.real) - (this.real * x.imaginary)) / denominator;
        
        return new ComplexNumber(newReal, newImaginary);
    }
}