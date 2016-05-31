/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyelakhirfisdas;

/**
 *
 * @author Sandi
 */
class DCMotorFormula{
	public double  b;
	public double  n;
	public boolean arahB;
	public double  panjang;
	public double  lebar;
	public double  i;
	public double  r;
	public boolean arahI;

	public DCMotorFormula(){}

	public double getLuas(){
		return panjang*lebar;
	}

	public double getV(){
		return i*r;
	}

	public double computeW(){
		return Math.asin(getV()/(b*getLuas()));
	}
}