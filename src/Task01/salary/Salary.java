package Task01.salary;

import Task01.employee.Employee;


    public  class Salary  extends Employee {

        private float payment;

        public Salary(String name,String idCard,String empId ,String position,float payment){
            super(name,idCard,empId,position);
            this.payment=payment;
    }

        @Override
        public void display() {
            super.display();
            System.out.println("Salary: "+payment);

        }

        public  float calculateBonus(float percentage) {
            return (payment*percentage)/100;
        }
        public  float calculateBonus(float percentage, float allowance) {
            return (payment*percentage)/100+allowance;
        }
        public float calculateBonus(int fixedAmount) {
            return fixedAmount;
        }
    }
