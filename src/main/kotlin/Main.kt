fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

// Java Program to illustrate Rookie Approach
// In Banking transaction system
// Class 1
// Bank class
// Defining the banking transaction
internal class Bank() {
    // Initial balance $100
    var total = 100

    // Money withdrawal method. Withdraw only if
    // total money greater than or equal to the money
    // requested for withdrawal
    // Method
    // To withdraw money
    fun withdrawn(name: String, withdrawal: Int) {
        if (total >= withdrawal) {
            println(
                name + " withdrawn "
                        + withdrawal
            )
            total = total - withdrawal
            println(
                ("Balance after withdrawal: "
                        + total)
            )
            // Making the thread sleep for 1 second after
            // each withdrawal

            // Try block to check for exceptions
            try {

                // Making thread t osleep for 1 second
                Thread.sleep(1000)
            } // Catch block to handle the exceptions
            catch (e: InterruptedException) {

                // Display the exception along with line
                // number
                // using printStacktrace() method
                e.printStackTrace()
            }
        } else {

            // Print statements
            println(
                (name
                        + " you can not withdraw "
                        + withdrawal)
            )
            println("your balance is: $total")

            // Making the thread sleep for 1 second after
            // each transaction failure

            // Try block to check for exceptions
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }

    // Method - to deposit money
    // Accept money whenever deposited
    fun deposit(name: String, deposit: Int) {
        println("$name deposited $deposit")
        total = total + deposit
        println(
            ("Balance after deposit: "
                    + total)
        )
        // Making the thread sleep for 1 second after
        // each deposit
        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}

// Class 2
// main class
internal object GFG {
    // Main driver method
    @JvmStatic
    fun main(args: Array<String>) {
        // Declaring an object of Bank class and calling the
        // withdarwn and deposit methods with suitable
        // parameters

        // Creating object of class 1 inside main()
        val obj = Bank()

        // Custom input - Transactions
        obj.withdrawn("", 2000)
        obj.deposit("", 10000)
        obj.withdrawn("", 2000)

    }
}
