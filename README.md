# ATM Simulator System

The ATM Simulator System is a Java-based application simulating the functionality of an Automated Teller Machine (ATM). This project utilizes core Java concepts like AWT (Abstract Window Toolkit) and Swing for GUI components, along with MySQL for database management, simulating typical ATM transactions such as cash withdrawal, deposit, balance inquiry, and mini statements.

## Features
- **Login System**: Users can securely log into the system using a PIN.
- **Withdrawal**: Simulates cash withdrawals in different denominations.
- **Deposit**: Allows users to deposit amounts into their account.
- **Balance Inquiry**: Displays the current balance of the user.
- **Mini Statement**: Provides a transaction history for recent transactions.
- **GUI Design**: Built using AWT and Swing for a graphical user interface.
- **Database Integration**: MySQL is used for managing user accounts and transactions.

## Technologies Used
- **Java**: The core programming language used for backend logic and functionality.
- **Swing**: For building the graphical user interface (GUI).
- **AWT**: For additional window-based components.
- **MySQL**: Used for data storage, managing user accounts, and transaction records.
- **JDBC**: Java Database Connectivity is used for connecting the Java application with the MySQL database.
- **MySQL Workbench**: To manage and interact with the MySQL database.

## How to Run the Project

### Prerequisites
- **JDK** (Java Development Kit) version 8 or later.
- **MySQL**: Ensure that MySQL is installed and the `bankmanagementsystem` database is set up.
- **MySQL Connector**: Add the MySQL JDBC driver to the project's classpath.
- **IDE**: You can use VS Code, IntelliJ IDEA, or Eclipse.

### Steps to Set Up
1. Clone this repository to your local machine.
2. In your IDE (e.g., VS Code), open the project.
3. Ensure you have added the MySQL connector to the project. You can add it by downloading the `mysql-connector.jar` file and adding it to the referenced libraries.
4. Set up the MySQL database:
   - Create a database named `bankmanagementsystem`.
   - Use the provided SQL scripts (if any) to create the necessary tables and data.
5. Modify the `Conn.java` file:
   - Update the connection URL, username, and password to match your local MySQL setup.
   ```java
   c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankmanagementsystem", "root", "your_password");
ATM-Simulator-System/
│
├── src/
│   └── ASimulatorSystem/
│       ├── Conn.java        # Manages database connection
│       ├── Login.java       # Manages the login functionality
│       ├── Signup.java      # Handles user registration
│       ├── FastCash.java    # Manages fast cash withdrawals
│       ├── Deposit.java     # Manages deposit transactions
│       ├── Withdrawl.java   # Manages withdrawal transactions
│       ├── MiniStatement.java # Displays recent transactions
│       └── icons/           # Contains images used in the GUI
├── README.md                # Project description and instructions
└── mysql-connector-j-8.4.0.jar # MySQL JDBC driver
