package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	// constructor 
	Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySSI){
		iYearsToWork = this.iYearsToWork;
		dAnnualReturnWorking = this.dAnnualReturnWorking;
		iYearsRetired = this.iYearsRetired;
		dAnnualReturnRetired = this.dAnnualReturnRetired;
		dRequiredIncome = this.dRequiredIncome;
		dMonthlySSI = this.dMonthlySSI;
	}
	
	// getters and setters	
	public int getiYearsToWork() {
		return iYearsToWork;
	}
	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}
	
	public int getiYearsRetired() {
		return iYearsRetired;
	}
	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}
	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}
	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}
	public double getdRequiredIncome() {
		return dRequiredIncome;
	}
	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}
	public double getdMonthlySSI() {
		return dMonthlySSI;
	}
	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}
	
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		return 0;
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		return 0;
	}
}
