package com.meritamerica.assignment1;

public class MeritAmericaBankApp
{
	public static void main(
			String[] args )
	{
		AccountHolder ah = new AccountHolder( "a", "b", "n", "ssn", 100, 1000 );
		System.out.println( ah.toString() );
	}

	public static double futureValue(
			double presentValue,
			double interestRate,
			int years )
	{
		return presentValue * Math.pow( 1 + interestRate / 100, years );
	}
}