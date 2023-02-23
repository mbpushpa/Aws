package com.clswrk.shoppingapp;

import com.clswork.account.AccountforShop;
import com.shopping.cards.CreditCard;
import com.shopping.cards.Debitcard;

public class Payment {
	public void payment(ShoppingApp1 s1,Debitcard d1,double amt,int cvv,AccountforShop a1)
	{
		if(s1.pamt == amt && d1.cvv==cvv && a1.bal>amt)
		{
			d1.transaction(cvv, a1, 2, amt);
			System.out.println("product placed to "+s1.address);

		}
		else
		{
			System.out.println("entered amt is wrong or cvv is wrong ");
		}
	}
	public void payment(ShoppingApp1 s1,CreditCard c1,double amt,int cvv,AccountforShop a1)
	{
		if(s1.pamt==amt && c1.cvv==cvv && c1.creditbal>amt)
		{
			if(amt<c1.creditbal)
			{
			double b1=c1.creditbal-amt;
			System.out.println("product placed to "+s1.address);
			}
			else
			{
				System.err.println("creditcard limit is  exceeded");
			}
		}
		else
		{
			System.err.println("entered amt is wrong");//out-->output string
			                                           //err-->error string
		}
	}


}
