package org.abs;

import org.string.Revision;

public class Partial extends Revision {

	@Override
	public void fixed() {
		System.out.println("7%fixed");
		
	}
	public static void main(String[] args) {
		Partial p=new Partial();
		p.fixed();
		p.deposit();
		p.savings();
	}

}
