package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapConceptInCollectionForStoreAccountDetailsAtRunTime {

	public static void main(String[] args) {

		Map<String, String> accountMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of accounts: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Account Number: ");
            String accountNumber = scanner.nextLine();
            
            System.out.println("Enter Account Holder Name: ");
            String accountHolderName = scanner.nextLine();
            
            accountMap.put(accountNumber, accountHolderName);
        }
        
        // Display stored accounts
        System.out.println("\nStored Account Details:");
        for (Map.Entry<String, String> entry : accountMap.entrySet()) {
            System.out.println("Account Number: " + entry.getKey() + ", Account Holder: " + entry.getValue());
        }
        
        scanner.close();
   
	}

}
