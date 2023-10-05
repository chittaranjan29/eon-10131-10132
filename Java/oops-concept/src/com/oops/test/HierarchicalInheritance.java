package com.oops.test;

class Identity
{
	public void identityTest()
	{
		System.out.println("Identity test method invoked");
	}
}

class Adhar extends Identity
{
	public String adharNumber="GGIIU2897273";
	
	public void adharIdentityTest()
	{
		System.out.println("adharIdentityTest method invoked");
		System.out.println("Adhar card number:"+this.adharNumber);
	}
	
}

class Voter extends Identity
{

	public String voterNumber="LDSKFLDF897937837";
	
	public void voterIdentityTest()
	{
		System.out.println("voterIdentityTest method invoked");
		System.out.println("Voter card number:"+this.voterNumber);
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Voter voter=new Voter();
		voter.identityTest();
		voter.voterIdentityTest();
		
		
		Adhar adhar=new Adhar();
		adhar.identityTest();
		adhar.adharIdentityTest();

	}

}
