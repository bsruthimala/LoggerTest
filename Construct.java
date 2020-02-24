package Construct.Logger;
import java.util.Scanner;
import java.util.logging.Logger;
public class Construct {
	public void dimensions(){
		int standard = 1200;
		int abvstandard = 1500;
		int highstandard = 1800;
		int fullyautomated = 2500;
		float area ;
		try (Scanner sc = new Scanner(System.in)) {
		System.out.format("%s", "Enter the area of the home to be constructed : ");
		area = sc.nextFloat();
		float total_cost;
		Boolean flag=true;
		while (flag){
		Logger log =Logger.getLogger(Construct.class.getName());
		log.info("Given area is : "+area);
		log.info("Which type of home do you want to perform ");
		System.out.format("%s", "\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.Automated Home\n");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
		log.info("Standard Material costs:"+standard);
		total_cost = area*standard;
		log.info("Standard Material costs : "+total_cost);
		        break;
		case 2 :
		log.info("Above Standard Material costs: "+abvstandard);
		total_cost = area*abvstandard;
		log.info("Above Standard Material cost is : "+total_cost);
		        break;
		case 3 :
		log.info("High Standard Material costs: "+highstandard);
		total_cost = area*highstandard;
		log.info("High Standard Material costs is : "+total_cost);
		        break;
		case 4 :
		log.info("High  Standard Material with Automated costs: "+fullyautomated);
		total_cost = area*fullyautomated;
		log.info("High Standard Material with Automated Home cost is "+total_cost);
		        break;
		}
		}
		}
		catch(Exception e) {
		System.out.format("%s", "Given area is wrong");
		}
		}
}
