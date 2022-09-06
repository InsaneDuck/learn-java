package introduction.abstracts.student;

public class class11 extends student
{
	int phyT,phyP,matT,matP,cheT,cheP,english,hindi;
	class11()
	{
		
	}
	class11(String name,int phyT,int phyP,int matT,int matP,int cheT,int cheP,int english,int hindi)
	{
		super(name);
		this.phyP=phyP;
		this.phyT=phyT;
		this.matP=matP;
		this.matT=matT;
		this.cheP=cheP;
		this.cheT=cheT;
		this.english=english;
		this.hindi=hindi;
	}
	@Override
	public double findPercentage()
	{
		double total=((0.4*(phyP+matP+cheP))+(0.6*(phyT+matT+cheP))+english+hindi);
		return (total/500)*100;
	}
	public int getCheP()
	{
		return cheP;
	}
	public int getCheT()
	{
		return cheT;
	}
	public int getEnglish()
	{
		return english;
	}
	public int getHindi()
	{
		return hindi;
	}
	public int getMatP()
	{
		return matP;
	}
	public int getMatT()
	{
		return matT;
	}
	public int getPhyP()
	{
		return phyP;
	}
	public int getPhyT()
	{
		return phyT;
	}
	public void setCheP(int cheP)
	{
		this.cheP = cheP;
	}
	public void setCheT(int cheT)
	{
		this.cheT = cheT;
	}
	public void setEnglish(int english)
	{
		this.english = english;
	}
	public void setHindi(int hindi)
	{
		this.hindi = hindi;
	}
	public void setMatP(int matP)
	{
		this.matP = matP;
	}
	public void setMatT(int matT)
	{
		this.matT = matT;
	}
	public void setPhyP(int phyP)
	{
		this.phyP = phyP;
	}
	public void setPhyT(int phyT)
	{
		this.phyT = phyT;
	}
	@Override
	public String toString()
	{
		return "Name="+name+" ,Percentage="+findPercentage();
	}
}
