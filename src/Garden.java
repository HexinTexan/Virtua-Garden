import java.util.ArrayList;
import java.util.Scanner;

public class Garden {
	

	public static void main(String[] args){
		String name;
		String color = null;
		String tall = null;
		int type;
		String yn = null;
		String swap;
		ArrayList<Basic> garden = new ArrayList<Basic>();
		
		
		System.out.println("Hello and welcome to your virtual garden.");
		System.out.println("Your choices are as follows:");
		System.out.println("Cactus, Tree, Flower, Grass");
	
		Scanner input = new Scanner(System.in);
		Back:
	while (input.hasNext())	{
		
	
		
		swap = input.nextLine();
		switch (swap.toLowerCase()) {

		case "cactus" :
		
				System.out.println("What color would you like your cacti?");
				color = input.nextLine();
				System.out.println("How tall would you like your cacti?");
				tall = input.nextLine();
				System.out.println("What is your cacti called?");
				name = input.nextLine();
				type = 1;
			
				garden.add(new Plant(name,color,tall,type));
			break;
			
		case "tree" :
				System.out.println("What color would you like your tree?");
						color = input.nextLine();
				System.out.println("How tall would you like your tree?");
						tall = input.nextLine();
				System.out.println("What is your tree called?");
						name = input.nextLine();	
				type = 2;
				Plant b = new Plant(name,color,tall,type);
				garden.add(b);	
			break;
		
		case "flower" :
				System.out.println("What color would you like your flower?");
					color = input.nextLine();
				System.out.println("What is yout flower called?");
					name = input.nextLine();
					type = 3;
					garden.add(new Plant(name,color,tall,type));
			break;	
			
		case "grass" :
				System.out.println("How tall would you like your grass?");
					tall = input.nextLine();
				System.out.println("What is your grass called?");
					name = input.nextLine();
					type = 4;
					garden.add(new Plant(name,color,tall,type));
			break;		
			
		default :
			System.out.println("invalid input");
			System.out.println("Your choices are as follows:");
			System.out.println("Cactus, Tree, Flower, Grass");
				continue Back;
			}
		System.out.println("Would you like to make another?");
			yn = input.nextLine().toLowerCase();
			switch (yn) {
			case "yes":
				System.out.println("Your choices are as follows:");
				System.out.println("Cactus, Tree, Flower, Grass");
				continue Back;
			case "no":	
				for (Basic a : garden) {
					a.build();
					break;
				}
					break;
				}
					break;
			}
		input.close();
	}
	}


	