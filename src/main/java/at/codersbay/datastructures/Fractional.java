package at.codersbay.datastructures;

import java.util.Scanner;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    public Integer numerator;
    public Integer denominator;

    public Fractional(Integer numerator, Integer denominator) {

            this.numerator = numerator;
            this.denominator = denominator;

            if (denominator == 0){
            throw new IllegalArgumentException("You shall not divide through zero!");
        } else if (denominator == null){
            throw new IllegalArgumentException();
        }

        // TODO implement to fix tests in FractionalTest1
    }


    public Integer getNumerator() {
        return this.numerator;
        // TODO implement to fix tests in FractionalTest1
    }

    public Integer getDenominator() {
        return this.denominator;
        // TODO implement to fix tests in FractionalTest1
    }

    public Float asFloat() {
        Float asFloatIntOne = this.numerator.floatValue();
        Float asFloatIntTwo = this.denominator.floatValue();
                ;
        Float asFloatFloat = asFloatIntOne/asFloatIntTwo;
        // TODO implement to fix tests in FractionalTest2
        return asFloatFloat;
    }

    @Override
    public boolean equals(Object obj) {

            if(obj instanceof Fractional) {
                Fractional frac = (Fractional) obj;

                if(((double) this.numerator / (double) this.denominator) == ((double) frac.numerator / (double) frac.denominator)) {
                    return true;
                }
                return denominator * frac.numerator == numerator * frac.denominator;
            }
        // TODO implement to fix tests in FractionalTest3
            return false;
    }

    public Fractional multiply(Fractional other) {
        if (((this.numerator < 0 && other.numerator < 0) && (this.denominator < 0 && other.denominator < 0)) || ((this.numerator > 0 && other.numerator > 0) && (this.denominator > 0 && other.denominator > 0))) {
            return new Fractional(this.numerator * other.numerator, this.denominator * other.denominator);
        } else if (this.numerator < 0){
            this.numerator *= -1;

        }
        return new Fractional(0, 0);
        // TODO implement to fix tests in FractionalTest4
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4
        return new Fractional(this.numerator*other, this.denominator);
    }

    public Fractional divide(Fractional other) {

        // TODO implement to fix tests in FractionalTest5
        return new Fractional(this.numerator * other.denominator, this.denominator*other.numerator);
    }

    public Fractional divide(Integer other) {
        if (other == 0){
            throw new IllegalArgumentException();
        } else
            return new Fractional(this.numerator + this.denominator*other, this.denominator);
    }

    public Fractional add(Fractional other) {

        if (other.numerator == 0){
            return new Fractional(this.numerator, this.denominator);
        }

        if (this.denominator < other.denominator){

            for (int i = 1; i < 100 ; i++){
                this.denominator = this.denominator * i;

                if (this.denominator == other.denominator){
                    return new Fractional(this.numerator * i + other.numerator, other.denominator);
                }
            }
        } else if (this.denominator > other.denominator){
            return new Fractional(this.numerator * other.denominator + other.numerator * this.denominator, this.denominator * other.denominator);
        }

        // TODO implement to fix tests in FractionalTest6
        return new Fractional(1, 1);
    }

    public Fractional add(Integer other) {
        if (other == 0){
            return new Fractional(this.numerator, this.denominator);
        } else
            return new Fractional(this.denominator * other + this.numerator, this.denominator);

        // TODO implement to fix tests in FractionalTest6
    }

    public Fractional subtract(Fractional other) {

        if (other.numerator == 0){
            return new Fractional(this.numerator, this.denominator);
        }

        if (other.denominator > this.denominator){
            int multiplier = other.denominator/this.denominator;
            return new Fractional(this.numerator * multiplier - other.numerator, other.denominator);
        } else if (this.denominator > other.denominator){
            return new Fractional(this.numerator * other.denominator - other.numerator * this.denominator, this.denominator*other.denominator);
        }

        // TODO implement to fix tests in FractionalTest7
        return new Fractional(1, 1);
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(this.numerator - (this.denominator * other), this.denominator);
    }

}