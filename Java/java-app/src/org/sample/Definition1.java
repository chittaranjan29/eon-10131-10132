package org.sample;


import org.sample.Definition.Source;

class Definition1
{
  //ABVC3089_job
	class Source
	{
		public  boolean checkUserName(String userName) 
		{
			boolean status=userName.endsWith("_job");
			String st[]=userName.split("_job");
			int length=st[0].length();
			
			if(status==true && length>=8)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		
		public static void main(String[] args) 
		{
	
			Source source=new Definition1().new Source();
			System.out.println(source.checkUserName("aman35355_job"));
			System.out.println(source.checkUserName("kumar44_job"));
			System.out.println(source.checkUserName("shalini378873783"));
		
			

		}
	}
}

