package com.meritamerica.assignment1;
//test

public class AccountHolder
{
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String ssn;
	private CheckingAccount accountChecking;
	private SavingsAccount accountSavings;

	AccountHolder()
	{
		this.nameFirst = new String();
		this.nameMiddle = new String();
		this.nameLast = new String();
		this.ssn = new String();
		this.accountChecking = new CheckingAccount( 0 );
		this.accountSavings = new SavingsAccount( 0 );
	}

	AccountHolder(
			String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance,
			double savingsAccountOpeningBalance
	)
	{
		setFirstName( firstName );
		setMiddleName( middleName );
		setLastName( lastName );
		setSSN( ssn );
		this.accountChecking = new CheckingAccount( checkingAccountOpeningBalance );
		this.accountSavings = new SavingsAccount( savingsAccountOpeningBalance );
	}

	public String getFirstName()
	{
		return this.nameFirst;
	}

	public void setFirstName(
			String firstName
	)
	{
		this.nameFirst = firstName;
	}

	public String getMiddleName()
	{
		return this.nameMiddle;
	}

	public void setMiddleName(
			String middleName
	)
	{
		this.nameMiddle = middleName;
	}

	public String getLastName()
	{
		return this.nameLast;
	}

	public void setLastName(
			String lastName
	)
	{
		this.nameLast = lastName;
	}

	public String getSSN()
	{
		return this.ssn;
	}

	public void setSSN(
			String ssn
	)
	{
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount()
	{
		return this.accountChecking;
	}

	public SavingsAccount getSavingsAccount()
	{
		return this.accountSavings;
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder( "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() );
		s.append( "\nSSN: " + this.getSSN() );
		s.append( "\n" + this.getCheckingAccount().toString() );
		s.append( "\n" + this.getSavingsAccount().toString() );
		return s.toString();
	}
}
