package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetirementTest {

	@Test
	public void Save_each_month_test() {
		int iYearsRetired = 20;
		double dAnnualReturnRetired = 0.02;
	    double dRequiredIncome = 10000;
		double dMonthlySSI = 2642;
		double dExpectedPV = 1454485.55;
		
		Retirement r1 = new Retirement();
		r1.setiYearsRetired(iYearsRetired);
		r1.setdAnnualReturnRetired(dAnnualReturnRetired);
		r1.setdRequiredIncome(dRequiredIncome);
		r1.setdMonthlySSI(dMonthlySSI);
		
		assertEquals(dExpectedPV, r1.TotalAmountSaved(), 0.01);
	}
	@Test
	public void Total_saved_test() {
		int iYearsToWork = 40;
		double dAnnualReturnWorking = 0.07;
		int iYearsRetired = 20;
		double dAnnualReturnRetired = 0.02;
	    double dRequiredIncome = 10000;
		double dMonthlySSI = 2642;
		double dExpectedPMT = 554.13;
		
		Retirement r1 = new Retirement();
		r1.setiYearsToWork(iYearsToWork);
		r1.setdAnnualReturnWorking(dAnnualReturnWorking);
		r1.setiYearsRetired(iYearsRetired);
		r1.setdAnnualReturnRetired(dAnnualReturnRetired);
		r1.setdRequiredIncome(dRequiredIncome);
		r1.setdMonthlySSI(dMonthlySSI);
		
		assertEquals(dExpectedPMT, r1.AmountToSave(), 0.01);
	}
}
	

