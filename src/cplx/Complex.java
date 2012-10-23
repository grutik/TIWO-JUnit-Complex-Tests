package cplx;

public class Complex{

	private double re;
	private double im;

	public Complex(){
		this.re = 0.0;
		this.re = 0.0;
	}
	
	public Complex(double re, double im){
		this.re = re;
		this.im = im;

	}

	public Complex(double re){
		this.re = re;
		this.im = 0.0;
	}
	
	public double getRe(){
		return this.re;
	}
	public double getIm(){
		return this.im;
	}

	public static Complex add(Complex c1, Complex c2) {
		return new Complex(c1.getRe() + c2.getRe(), c1.getIm() + c2.getIm());
	}

       	public void add(Complex c) {
		this.re += c.getRe();
		this.im += c.getIm();
        }
}

