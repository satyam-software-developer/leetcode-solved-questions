class Employee{
    int id;
    int salary;
    
    Employee(int id, int salary){
        this.id = id;
        this.salary = salary;
    }
    
}

class SalesEmployee extends Employee{
        int sales;
        
        SalesEmployee(int id, int salary, int sales){
            super(id, salary);
            this.sales = sales;
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna