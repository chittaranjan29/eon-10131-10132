package com.test;

import java.util.ArrayList;
import java.util.List;

class Insect
{
	private String insectName;
	private int insectWeight;
	
	
	public Insect(String insectName,int insectWeight)
	{
		this.insectName=insectName;
		this.insectWeight=insectWeight;
	}


	public String getInsectName() {
		return insectName;
	}


	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}


	public int getInsectWeight() {
		return insectWeight;
	}


	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}


	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
	
}

class Insecticides
{
	public List<String> mapInsectName(List<Insect> list)
	{
		List<String> names = new ArrayList<String>();
		
		for(Insect insect:list)
		{
			names.add(insect.getInsectName());
		}
		return names;
	}
	
	public List<Insect> getWeight(List<Insect> list)
	{
		List<Insect> filteredList=new ArrayList<Insect>(); 
		
		for(Insect insect:list)
		{
			if(insect.getInsectWeight()>40 && insect.getInsectWeight()<=100)
			{
				filteredList.add(insect);
			}
		}
		
		return filteredList;
	}
		
}

public class PaperWaspSolution {

	public static void main(String[] args) {
		
		List<Insect> insects=new ArrayList<Insect>();
		insects.add(new Insect("Ant",50));
		insects.add(new Insect("Bee",90));
		insects.add(new Insect("Cockroach",70));
		insects.add(new Insect("Paper wasp",30));
		
		Insecticides insecticides=new Insecticides();
		
		System.out.println(insecticides.mapInsectName(insects));
		System.out.println(insecticides.getWeight(insects));
	}

}
