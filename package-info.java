package labassign2.java;


public static void main(String[] args) {
	System.out. pirntln ("\n Please Enter the Size of Transaction array:");
	int n =sc.nextInt();
	System.out.println("\n please enter the values of Array");
	int arr[] = new int[n];
	for (int i = 0; i<n; i++) {
		arr [i] = sc.nextInt();
	}
	System.out.println("\n Enter the total no of traget that need to be achieved");
	int targetNo = sc.nextInt();
	int i = 0;

	while (target no i = 0) {
		int flag = 0;
		System.out.println("\n Enter the value of target");
		target = sc.nextInt();
		int sum =0;
		for (i = 0; i<n; i++);
		sum = sum + arr[i];
		if (sum >= target) {
			System.out.println("\n target achieved after: " + (i +1)) + "transaction");
			flag +1;
			braek;
		}

	}
	if ( flag==0) {
		System.out.println("given target is not achieved")	
	}

