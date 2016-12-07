package com.test;
public class SZTax {

	/**
	 * 返回扣除社保医保公积金后薪水
	 * @param salaryBeforeTax 扣除社保医保公积金前薪水
	 * @return
	 */
	public double salaryAfterTax(double salaryBeforeTax)
	{
//		（3W-3.5K）*25%-1005
//		扣税公式是：
//		（扣除社保医保公积金后薪水-个税起征点）*税率-速算扣除数
		double taxbase=salaryBeforeTax-3500;
		int Taxrate=0;//这里税率没有除以百分比；
		int Quickdeduction=0;
		if(taxbase <=0)//低于个税起征点
		{
			return salaryBeforeTax;
		}else if(taxbase <=1500)
		{
			Taxrate=3;
			Quickdeduction=0;
		}else if(taxbase <=4500)
		{
			Taxrate=10;
			Quickdeduction=105;
		}else if(taxbase <=9000)
		{
			Taxrate=20;
			Quickdeduction=555;
		}else if(taxbase <=35000)
		{
			Taxrate=25;
			Quickdeduction=1005;
		}else if(taxbase <=55000)
		{
			Taxrate=30;
			Quickdeduction=2755;
		}else if(taxbase <=80000)
		{
			Taxrate=35;
			Quickdeduction=5505;
		}else
		{
			Taxrate=45;
			Quickdeduction=13505;
		}			
		return salaryBeforeTax-((salaryBeforeTax-3500)*Taxrate/100-Quickdeduction);
	}
	
	public void costeffectivesalary(int salaryBeforeTax)
	{
		//从1万算起，100的步长算到10万，找出税后税前比最大的。
		for (;salaryBeforeTax <= 100000; salaryBeforeTax=salaryBeforeTax+100) {
			float rate=(float)salaryAfterTax(salaryBeforeTax)/salaryBeforeTax*100000;
			System.out.println(""+salaryBeforeTax+"-----------"+salaryAfterTax(salaryBeforeTax)+"-----------"+rate);
		}
	}
	
	public static void main(String[] args) 
	{
		double money = 16289.48;
		double should = new SZTax().salaryAfterTax(money);
		System.out.println("should:"+should+",税:"+(money-should));
		
		for(int i=10000;i<50000;i+=100){
			should = new SZTax().salaryAfterTax(i);
			System.out.println(i +","+should+","+ (should*100/i));
		}
		
	}
}