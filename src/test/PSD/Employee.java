public class Employee {
    int employee_number;
    String family_name;
    String given_name;
    float rate;
    int contracted_hours;
    int actual_hours;

    public Employee(int employee_number, String family_name, String given_name, float rate, int contracted_hours, int actual_hours) {
        this.employee_number=employee_number;
        this.family_name=family_name;
        this.given_name=given_name;
        this.rate=rate;
        this.contracted_hours=contracted_hours;
        this.actual_hours=actual_hours;
    }

    public double computePay() {
        if (actual_hours <= contracted_hours)
            return rate * actual_hours;

        return rate * actual_hours + 1.5 * rate * (actual_hours - contracted_hours);
    }

}
