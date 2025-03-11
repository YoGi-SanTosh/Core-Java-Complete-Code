package StringConcept14Feb2025;

public class WAPtopassanythingatRuntimeusingargsvariableinthemainmethod {

	public static void main(String[] args) {

        // Check if any arguments are passed
        if (args.length > 0)
        {
        	System.out.println(args[0]);
        	System.out.println(args[1]);
        	
            System.out.println("Arguments passed at runtime:");
            // Loop through the arguments and print each one
            for (int i = 0; i < args.length; i++) 
            {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } 
        
        else 
        {
            System.out.println("No arguments were passed at runtime.");
        }

	}

}
